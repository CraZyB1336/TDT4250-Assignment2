/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Flags#getFlagName <em>Flag Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Flags#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getFlags()
 * @model
 * @generated
 */
public interface Flags extends EObject {
	/**
	 * Returns the value of the '<em><b>Flag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag Name</em>' attribute.
	 * @see #setFlagName(String)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getFlags_FlagName()
	 * @model required="true"
	 * @generated
	 */
	String getFlagName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Flags#getFlagName <em>Flag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag Name</em>' attribute.
	 * @see #getFlagName()
	 * @generated
	 */
	void setFlagName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getFlags_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Flags#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // Flags
