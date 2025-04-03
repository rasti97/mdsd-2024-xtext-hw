/**
 */
package statemachine.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.StringArgument#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getStringArgument()
 * @model
 * @generated
 */
public interface StringArgument extends PrintArgument {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see statemachine.model.ModelPackage#getStringArgument_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link statemachine.model.StringArgument#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringArgument
