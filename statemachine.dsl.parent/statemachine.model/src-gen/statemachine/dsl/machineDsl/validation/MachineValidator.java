/**
 *
 * $Id$
 */
package statemachine.dsl.machineDsl.validation;

import org.eclipse.emf.common.util.EList;

import statemachine.dsl.machineDsl.State;
import statemachine.dsl.machineDsl.VariableDeclaration;

/**
 * A sample validator interface for {@link statemachine.dsl.machineDsl.Machine}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MachineValidator {
	boolean validate();

	boolean validateVariables(EList<VariableDeclaration> value);
	boolean validateStates(EList<State> value);
}
