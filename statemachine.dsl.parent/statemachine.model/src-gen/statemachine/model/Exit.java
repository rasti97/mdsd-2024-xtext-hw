/**
 */
package statemachine.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.Exit#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.model.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see statemachine.model.ModelPackage#getExit_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Exit
