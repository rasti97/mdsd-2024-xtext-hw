/**
 */
package statemachine.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.Print#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends Command {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.model.PrintArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see statemachine.model.ModelPackage#getPrint_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrintArgument> getArguments();

} // Print
