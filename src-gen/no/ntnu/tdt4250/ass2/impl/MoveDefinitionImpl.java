/**
 */
package no.ntnu.tdt4250.ass2.impl;

import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.MoveDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#getMoveX <em>Move X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#getMoveY <em>Move Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#isIsInfinite <em>Is Infinite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#isCanJump <em>Can Jump</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#isCanCapture <em>Can Capture</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#isCanMoveOnly <em>Can Move Only</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl#isFirstMoveOnly <em>First Move Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveDefinitionImpl extends MinimalEObjectImpl.Container implements MoveDefinition {
	/**
	 * The default value of the '{@link #getMoveX() <em>Move X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveX()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMoveX() <em>Move X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveX()
	 * @generated
	 * @ordered
	 */
	protected int moveX = MOVE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoveY() <em>Move Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveY()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMoveY() <em>Move Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveY()
	 * @generated
	 * @ordered
	 */
	protected int moveY = MOVE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInfinite() <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfinite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INFINITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInfinite() <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfinite()
	 * @generated
	 * @ordered
	 */
	protected boolean isInfinite = IS_INFINITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanJump() <em>Can Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanJump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_JUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanJump() <em>Can Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanJump()
	 * @generated
	 * @ordered
	 */
	protected boolean canJump = CAN_JUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanCapture() <em>Can Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCapture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_CAPTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanCapture() <em>Can Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCapture()
	 * @generated
	 * @ordered
	 */
	protected boolean canCapture = CAN_CAPTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanMoveOnly() <em>Can Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanMoveOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MOVE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanMoveOnly() <em>Can Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanMoveOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean canMoveOnly = CAN_MOVE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirstMoveOnly() <em>First Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstMoveOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_MOVE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirstMoveOnly() <em>First Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstMoveOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean firstMoveOnly = FIRST_MOVE_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.MOVE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMoveX() {
		return moveX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveX(int newMoveX) {
		int oldMoveX = moveX;
		moveX = newMoveX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__MOVE_X, oldMoveX,
					moveX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMoveY() {
		return moveY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveY(int newMoveY) {
		int oldMoveY = moveY;
		moveY = newMoveY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__MOVE_Y, oldMoveY,
					moveY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsInfinite() {
		return isInfinite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInfinite(boolean newIsInfinite) {
		boolean oldIsInfinite = isInfinite;
		isInfinite = newIsInfinite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__IS_INFINITE,
					oldIsInfinite, isInfinite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanJump() {
		return canJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanJump(boolean newCanJump) {
		boolean oldCanJump = canJump;
		canJump = newCanJump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__CAN_JUMP, oldCanJump,
					canJump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanCapture() {
		return canCapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanCapture(boolean newCanCapture) {
		boolean oldCanCapture = canCapture;
		canCapture = newCanCapture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__CAN_CAPTURE,
					oldCanCapture, canCapture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanMoveOnly() {
		return canMoveOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanMoveOnly(boolean newCanMoveOnly) {
		boolean oldCanMoveOnly = canMoveOnly;
		canMoveOnly = newCanMoveOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__CAN_MOVE_ONLY,
					oldCanMoveOnly, canMoveOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFirstMoveOnly() {
		return firstMoveOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstMoveOnly(boolean newFirstMoveOnly) {
		boolean oldFirstMoveOnly = firstMoveOnly;
		firstMoveOnly = newFirstMoveOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.MOVE_DEFINITION__FIRST_MOVE_ONLY,
					oldFirstMoveOnly, firstMoveOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ass2Package.MOVE_DEFINITION__MOVE_X:
			return getMoveX();
		case Ass2Package.MOVE_DEFINITION__MOVE_Y:
			return getMoveY();
		case Ass2Package.MOVE_DEFINITION__IS_INFINITE:
			return isIsInfinite();
		case Ass2Package.MOVE_DEFINITION__CAN_JUMP:
			return isCanJump();
		case Ass2Package.MOVE_DEFINITION__CAN_CAPTURE:
			return isCanCapture();
		case Ass2Package.MOVE_DEFINITION__CAN_MOVE_ONLY:
			return isCanMoveOnly();
		case Ass2Package.MOVE_DEFINITION__FIRST_MOVE_ONLY:
			return isFirstMoveOnly();
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
		case Ass2Package.MOVE_DEFINITION__MOVE_X:
			setMoveX((Integer) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__MOVE_Y:
			setMoveY((Integer) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__IS_INFINITE:
			setIsInfinite((Boolean) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_JUMP:
			setCanJump((Boolean) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_CAPTURE:
			setCanCapture((Boolean) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_MOVE_ONLY:
			setCanMoveOnly((Boolean) newValue);
			return;
		case Ass2Package.MOVE_DEFINITION__FIRST_MOVE_ONLY:
			setFirstMoveOnly((Boolean) newValue);
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
		case Ass2Package.MOVE_DEFINITION__MOVE_X:
			setMoveX(MOVE_X_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__MOVE_Y:
			setMoveY(MOVE_Y_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__IS_INFINITE:
			setIsInfinite(IS_INFINITE_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_JUMP:
			setCanJump(CAN_JUMP_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_CAPTURE:
			setCanCapture(CAN_CAPTURE_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__CAN_MOVE_ONLY:
			setCanMoveOnly(CAN_MOVE_ONLY_EDEFAULT);
			return;
		case Ass2Package.MOVE_DEFINITION__FIRST_MOVE_ONLY:
			setFirstMoveOnly(FIRST_MOVE_ONLY_EDEFAULT);
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
		case Ass2Package.MOVE_DEFINITION__MOVE_X:
			return moveX != MOVE_X_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__MOVE_Y:
			return moveY != MOVE_Y_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__IS_INFINITE:
			return isInfinite != IS_INFINITE_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__CAN_JUMP:
			return canJump != CAN_JUMP_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__CAN_CAPTURE:
			return canCapture != CAN_CAPTURE_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__CAN_MOVE_ONLY:
			return canMoveOnly != CAN_MOVE_ONLY_EDEFAULT;
		case Ass2Package.MOVE_DEFINITION__FIRST_MOVE_ONLY:
			return firstMoveOnly != FIRST_MOVE_ONLY_EDEFAULT;
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
		result.append(" (moveX: ");
		result.append(moveX);
		result.append(", moveY: ");
		result.append(moveY);
		result.append(", isInfinite: ");
		result.append(isInfinite);
		result.append(", canJump: ");
		result.append(canJump);
		result.append(", canCapture: ");
		result.append(canCapture);
		result.append(", canMoveOnly: ");
		result.append(canMoveOnly);
		result.append(", firstMoveOnly: ");
		result.append(firstMoveOnly);
		result.append(')');
		return result.toString();
	}

} //MoveDefinitionImpl
