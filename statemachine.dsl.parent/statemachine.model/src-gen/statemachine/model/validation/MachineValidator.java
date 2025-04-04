/**
 *
 * $Id$
 */
package statemachine.model.validation;

import org.eclipse.emf.common.util.EList;
import statemachine.model.Field;
import statemachine.model.State;


/**
 * A sample validator interface for {@link statemachine.model.Machine}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MachineValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateFields(EList<Field> value);

	boolean validateStates(EList<State> value);
}
