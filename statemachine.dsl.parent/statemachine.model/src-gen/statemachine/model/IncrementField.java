/**
 */
package statemachine.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.IncrementField#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getIncrementField()
 * @model
 * @generated
 */
public interface IncrementField extends Command {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see statemachine.model.ModelPackage#getIncrementField_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link statemachine.model.IncrementField#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // IncrementField
