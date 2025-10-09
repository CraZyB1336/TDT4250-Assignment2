/**
 */
package no.ntnu.tdt4250.ass2.impl;

import java.util.Collection;

import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.ChessPiece;
import no.ntnu.tdt4250.ass2.Player;
import no.ntnu.tdt4250.ass2.PlayerColor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.PlayerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.PlayerImpl#getPieces <em>Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerColor COLOR_EDEFAULT = PlayerColor.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected PlayerColor color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPieces() <em>Pieces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<ChessPiece> pieces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.PLAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(PlayerColor newColor) {
		PlayerColor oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.PLAYER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChessPiece> getPieces() {
		if (pieces == null) {
			pieces = new EObjectWithInverseResolvingEList<ChessPiece>(ChessPiece.class, this,
					Ass2Package.PLAYER__PIECES, Ass2Package.CHESS_PIECE__PLAYER);
		}
		return pieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.PLAYER__PIECES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPieces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.PLAYER__PIECES:
			return ((InternalEList<?>) getPieces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ass2Package.PLAYER__NAME:
			return getName();
		case Ass2Package.PLAYER__COLOR:
			return getColor();
		case Ass2Package.PLAYER__PIECES:
			return getPieces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ass2Package.PLAYER__NAME:
			setName((String) newValue);
			return;
		case Ass2Package.PLAYER__COLOR:
			setColor((PlayerColor) newValue);
			return;
		case Ass2Package.PLAYER__PIECES:
			getPieces().clear();
			getPieces().addAll((Collection<? extends ChessPiece>) newValue);
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
		case Ass2Package.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ass2Package.PLAYER__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case Ass2Package.PLAYER__PIECES:
			getPieces().clear();
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
		case Ass2Package.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ass2Package.PLAYER__COLOR:
			return color != COLOR_EDEFAULT;
		case Ass2Package.PLAYER__PIECES:
			return pieces != null && !pieces.isEmpty();
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
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
