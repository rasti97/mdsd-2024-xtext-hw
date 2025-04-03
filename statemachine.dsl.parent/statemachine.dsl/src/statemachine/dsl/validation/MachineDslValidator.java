package statemachine.dsl.validation;

import org.eclipse.xtext.validation.Check;
import statemachine.dsl.machineDsl.State;

public class MachineDslValidator extends AbstractMachineDslValidator {

    @Check
    public void checkNoSelfTransition(Transition transition) {
        State source = (State) transition.eContainer();
        State target = (State) transition.getTarget(); // 👈 cast added here

        if (source != null && target != null && source.equals(target)) {
            error("Self-transitions are not allowed.",
                  transition,
                  null);
        }
    }
}
