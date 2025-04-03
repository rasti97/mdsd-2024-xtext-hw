/**
 *
 * $Id$
 */
package statemachine.dsl.machineDsl.validation;

import statemachine.dsl.machineDsl.VarType;

/**
 * A sample validator interface for {@link statemachine.dsl.machineDsl.VariableDeclaration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariableDeclarationValidator {
	boolean validate();

	boolean validateString(VarType value);
	boolean validate_(Object value);
}
