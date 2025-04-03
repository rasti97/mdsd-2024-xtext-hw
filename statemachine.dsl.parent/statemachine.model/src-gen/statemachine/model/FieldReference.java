/**
 */
package statemachine.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.FieldReference#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getFieldReference()
 * @model
 * @generated
 */
public interface FieldReference extends PrintArgument {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see statemachine.model.ModelPackage#getFieldReference_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link statemachine.model.FieldReference#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FieldReference
