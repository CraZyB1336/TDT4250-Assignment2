/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Ability#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Ability#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownCounter <em>Cool Down Counter</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownStartNumber <em>Cool Down Start Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Ability#isTriggerOnCaptureOnly <em>Trigger On Capture Only</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility()
 * @model
 * @generated
 */
public interface Ability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Ability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.ass2.AbilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.AbilityType
	 * @see #setNewAttribute(AbilityType)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility_NewAttribute()
	 * @model required="true"
	 * @generated
	 */
	AbilityType getNewAttribute();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Ability#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.AbilityType
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(AbilityType value);

	/**
	 * Returns the value of the '<em><b>Cool Down Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cool Down Counter</em>' attribute.
	 * @see #setCoolDownCounter(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility_CoolDownCounter()
	 * @model required="true"
	 * @generated
	 */
	int getCoolDownCounter();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownCounter <em>Cool Down Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cool Down Counter</em>' attribute.
	 * @see #getCoolDownCounter()
	 * @generated
	 */
	void setCoolDownCounter(int value);

	/**
	 * Returns the value of the '<em><b>Cool Down Start Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cool Down Start Number</em>' attribute.
	 * @see #setCoolDownStartNumber(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility_CoolDownStartNumber()
	 * @model required="true"
	 * @generated
	 */
	int getCoolDownStartNumber();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownStartNumber <em>Cool Down Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cool Down Start Number</em>' attribute.
	 * @see #getCoolDownStartNumber()
	 * @generated
	 */
	void setCoolDownStartNumber(int value);

	/**
	 * Returns the value of the '<em><b>Trigger On Capture Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger On Capture Only</em>' attribute.
	 * @see #setTriggerOnCaptureOnly(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getAbility_TriggerOnCaptureOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isTriggerOnCaptureOnly();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Ability#isTriggerOnCaptureOnly <em>Trigger On Capture Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger On Capture Only</em>' attribute.
	 * @see #isTriggerOnCaptureOnly()
	 * @generated
	 */
	void setTriggerOnCaptureOnly(boolean value);

} // Ability
