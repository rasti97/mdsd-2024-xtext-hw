/**
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.machineDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.dsl.machineDsl.Machine#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.dsl.machineDsl.Machine#getFields <em>Fields</em>}</li>
 *   <li>{@link statemachine.dsl.machineDsl.Machine#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see statemachine.dsl.machineDsl.MachineDslPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see statemachine.dsl.machineDsl.MachineDslPackage#getMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link statemachine.dsl.machineDsl.Machine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link statemachine.dsl.machineDsl.Field}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see statemachine.dsl.machineDsl.MachineDslPackage#getMachine_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link statemachine.dsl.machineDsl.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see statemachine.dsl.machineDsl.MachineDslPackage#getMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Machine
