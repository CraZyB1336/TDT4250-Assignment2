/**
 */
package no.ntnu.tdt4250.ass2.impl;

import no.ntnu.tdt4250.ass2.Ability;
import no.ntnu.tdt4250.ass2.AbilityType;
import no.ntnu.tdt4250.ass2.Ass2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl#getCoolDownCounter <em>Cool Down Counter</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl#getCoolDownStartNumber <em>Cool Down Start Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl#isTriggerOnCaptureOnly <em>Trigger On Capture Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbilityImpl extends MinimalEObjectImpl.Container implements Ability {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final AbilityType NEW_ATTRIBUTE_EDEFAULT = AbilityType.PASSIVE;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected AbilityType newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolDownCounter() <em>Cool Down Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int COOL_DOWN_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoolDownCounter() <em>Cool Down Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownCounter()
	 * @generated
	 * @ordered
	 */
	protected int coolDownCounter = COOL_DOWN_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolDownStartNumber() <em>Cool Down Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownStartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COOL_DOWN_START_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoolDownStartNumber() <em>Cool Down Start Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownStartNumber()
	 * @generated
	 * @ordered
	 */
	protected int coolDownStartNumber = COOL_DOWN_START_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isTriggerOnCaptureOnly() <em>Trigger On Capture Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggerOnCaptureOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGER_ON_CAPTURE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTriggerOnCaptureOnly() <em>Trigger On Capture Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggerOnCaptureOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean triggerOnCaptureOnly = TRIGGER_ON_CAPTURE_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.ABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.ABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbilityType getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewAttribute(AbilityType newNewAttribute) {
		AbilityType oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute == null ? NEW_ATTRIBUTE_EDEFAULT : newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.ABILITY__NEW_ATTRIBUTE, oldNewAttribute,
					newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCoolDownCounter() {
		return coolDownCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoolDownCounter(int newCoolDownCounter) {
		int oldCoolDownCounter = coolDownCounter;
		coolDownCounter = newCoolDownCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.ABILITY__COOL_DOWN_COUNTER,
					oldCoolDownCounter, coolDownCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCoolDownStartNumber() {
		return coolDownStartNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoolDownStartNumber(int newCoolDownStartNumber) {
		int oldCoolDownStartNumber = coolDownStartNumber;
		coolDownStartNumber = newCoolDownStartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.ABILITY__COOL_DOWN_START_NUMBER,
					oldCoolDownStartNumber, coolDownStartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTriggerOnCaptureOnly() {
		return triggerOnCaptureOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerOnCaptureOnly(boolean newTriggerOnCaptureOnly) {
		boolean oldTriggerOnCaptureOnly = triggerOnCaptureOnly;
		triggerOnCaptureOnly = newTriggerOnCaptureOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.ABILITY__TRIGGER_ON_CAPTURE_ONLY,
					oldTriggerOnCaptureOnly, triggerOnCaptureOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ass2Package.ABILITY__NAME:
			return getName();
		case Ass2Package.ABILITY__NEW_ATTRIBUTE:
			return getNewAttribute();
		case Ass2Package.ABILITY__COOL_DOWN_COUNTER:
			return getCoolDownCounter();
		case Ass2Package.ABILITY__COOL_DOWN_START_NUMBER:
			return getCoolDownStartNumber();
		case Ass2Package.ABILITY__TRIGGER_ON_CAPTURE_ONLY:
			return isTriggerOnCaptureOnly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ass2Package.ABILITY__NAME:
			setName((String) newValue);
			return;
		case Ass2Package.ABILITY__NEW_ATTRIBUTE:
			setNewAttribute((AbilityType) newValue);
			return;
		case Ass2Package.ABILITY__COOL_DOWN_COUNTER:
			setCoolDownCounter((Integer) newValue);
			return;
		case Ass2Package.ABILITY__COOL_DOWN_START_NUMBER:
			setCoolDownStartNumber((Integer) newValue);
			return;
		case Ass2Package.ABILITY__TRIGGER_ON_CAPTURE_ONLY:
			setTriggerOnCaptureOnly((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ass2Package.ABILITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ass2Package.ABILITY__NEW_ATTRIBUTE:
			setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
			return;
		case Ass2Package.ABILITY__COOL_DOWN_COUNTER:
			setCoolDownCounter(COOL_DOWN_COUNTER_EDEFAULT);
			return;
		case Ass2Package.ABILITY__COOL_DOWN_START_NUMBER:
			setCoolDownStartNumber(COOL_DOWN_START_NUMBER_EDEFAULT);
			return;
		case Ass2Package.ABILITY__TRIGGER_ON_CAPTURE_ONLY:
			setTriggerOnCaptureOnly(TRIGGER_ON_CAPTURE_ONLY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ass2Package.ABILITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ass2Package.ABILITY__NEW_ATTRIBUTE:
			return newAttribute != NEW_ATTRIBUTE_EDEFAULT;
		case Ass2Package.ABILITY__COOL_DOWN_COUNTER:
			return coolDownCounter != COOL_DOWN_COUNTER_EDEFAULT;
		case Ass2Package.ABILITY__COOL_DOWN_START_NUMBER:
			return coolDownStartNumber != COOL_DOWN_START_NUMBER_EDEFAULT;
		case Ass2Package.ABILITY__TRIGGER_ON_CAPTURE_ONLY:
			return triggerOnCaptureOnly != TRIGGER_ON_CAPTURE_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", newAttribute: ");
		result.append(newAttribute);
		result.append(", coolDownCounter: ");
		result.append(coolDownCounter);
		result.append(", coolDownStartNumber: ");
		result.append(coolDownStartNumber);
		result.append(", triggerOnCaptureOnly: ");
		result.append(triggerOnCaptureOnly);
		result.append(')');
		return result.toString();
	}

} //AbilityImpl
