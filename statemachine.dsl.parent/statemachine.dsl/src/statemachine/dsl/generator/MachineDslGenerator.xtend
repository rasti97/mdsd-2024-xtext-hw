package statemachine.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator2
import statemachine.dsl.machineDsl.Machine
import statemachine.dsl.machineDsl.State
import statemachine.dsl.machineDsl.Transition
import statemachine.dsl.machineDsl.Action

class MachineDslGenerator implements IGenerator2 {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val machine = resource.contents.get(0) as Machine
        val fileName = machine.name + ".java"
        fsa.generateFile(fileName, generateCode(machine))
    }

    def CharSequence generateCode(Machine machine) '''
        public class «machine.name» {

            // States
            «FOR state : machine.states»
                public void «state.name.toLowerCase»State() {
                    System.out.println("Entering state: «state.name»");
                    «IF state.entry !== null»
                        «state.entry.code»
                    «ENDIF»
                    «IF state.exit !== null»
                        // Exit logic for «state.name»
                        «state.exit.code»
                    «ENDIF»
                }
            «ENDFOR»

            // Transitions
            «FOR state : machine.states»
                «FOR transition : state.transitions»
                    public void «transition.event.toLowerCase»() {
                        System.out.println("Transition «transition.event» -> «transition.target.name»");
                        «transition.target.name.toLowerCase»State();
                    }
                «ENDFOR»
            «ENDFOR»
        }
    '''
				
				override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}
				
				override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}
				
}
