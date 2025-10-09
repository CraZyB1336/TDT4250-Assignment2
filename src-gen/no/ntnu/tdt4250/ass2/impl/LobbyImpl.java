/**
 */
package no.ntnu.tdt4250.ass2.impl;

import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.Lobby;
import no.ntnu.tdt4250.ass2.Player;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lobby</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.LobbyImpl#getLobbyID <em>Lobby ID</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.LobbyImpl#getPlayerOne <em>Player One</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.LobbyImpl#getPlayerTwo <em>Player Two</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LobbyImpl extends MinimalEObjectImpl.Container implements Lobby {
	/**
	 * The default value of the '{@link #getLobbyID() <em>Lobby ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOBBY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLobbyID() <em>Lobby ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyID()
	 * @generated
	 * @ordered
	 */
	protected String lobbyID = LOBBY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerOne() <em>Player One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerOne()
	 * @generated
	 * @ordered
	 */
	protected Player playerOne;

	/**
	 * The cached value of the '{@link #getPlayerTwo() <em>Player Two</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerTwo()
	 * @generated
	 * @ordered
	 */
	protected Player playerTwo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LobbyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.LOBBY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLobbyID() {
		return lobbyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLobbyID(String newLobbyID) {
		String oldLobbyID = lobbyID;
		lobbyID = newLobbyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.LOBBY__LOBBY_ID, oldLobbyID, lobbyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerOne() {
		return playerOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerOne(Player newPlayerOne, NotificationChain msgs) {
		Player oldPlayerOne = playerOne;
		playerOne = newPlayerOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ass2Package.LOBBY__PLAYER_ONE, oldPlayerOne, newPlayerOne);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerOne(Player newPlayerOne) {
		if (newPlayerOne != playerOne) {
			NotificationChain msgs = null;
			if (playerOne != null)
				msgs = ((InternalEObject) playerOne).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.LOBBY__PLAYER_ONE, null, msgs);
			if (newPlayerOne != null)
				msgs = ((InternalEObject) newPlayerOne).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.LOBBY__PLAYER_ONE, null, msgs);
			msgs = basicSetPlayerOne(newPlayerOne, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.LOBBY__PLAYER_ONE, newPlayerOne,
					newPlayerOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayerTwo() {
		return playerTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerTwo(Player newPlayerTwo, NotificationChain msgs) {
		Player oldPlayerTwo = playerTwo;
		playerTwo = newPlayerTwo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ass2Package.LOBBY__PLAYER_TWO, oldPlayerTwo, newPlayerTwo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerTwo(Player newPlayerTwo) {
		if (newPlayerTwo != playerTwo) {
			NotificationChain msgs = null;
			if (playerTwo != null)
				msgs = ((InternalEObject) playerTwo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.LOBBY__PLAYER_TWO, null, msgs);
			if (newPlayerTwo != null)
				msgs = ((InternalEObject) newPlayerTwo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.LOBBY__PLAYER_TWO, null, msgs);
			msgs = basicSetPlayerTwo(newPlayerTwo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.LOBBY__PLAYER_TWO, newPlayerTwo,
					newPlayerTwo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.LOBBY__PLAYER_ONE:
			return basicSetPlayerOne(null, msgs);
		case Ass2Package.LOBBY__PLAYER_TWO:
			return basicSetPlayerTwo(null, msgs);
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
		case Ass2Package.LOBBY__LOBBY_ID:
			return getLobbyID();
		case Ass2Package.LOBBY__PLAYER_ONE:
			return getPlayerOne();
		case Ass2Package.LOBBY__PLAYER_TWO:
			return getPlayerTwo();
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
		case Ass2Package.LOBBY__LOBBY_ID:
			setLobbyID((String) newValue);
			return;
		case Ass2Package.LOBBY__PLAYER_ONE:
			setPlayerOne((Player) newValue);
			return;
		case Ass2Package.LOBBY__PLAYER_TWO:
			setPlayerTwo((Player) newValue);
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
		case Ass2Package.LOBBY__LOBBY_ID:
			setLobbyID(LOBBY_ID_EDEFAULT);
			return;
		case Ass2Package.LOBBY__PLAYER_ONE:
			setPlayerOne((Player) null);
			return;
		case Ass2Package.LOBBY__PLAYER_TWO:
			setPlayerTwo((Player) null);
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
		case Ass2Package.LOBBY__LOBBY_ID:
			return LOBBY_ID_EDEFAULT == null ? lobbyID != null : !LOBBY_ID_EDEFAULT.equals(lobbyID);
		case Ass2Package.LOBBY__PLAYER_ONE:
			return playerOne != null;
		case Ass2Package.LOBBY__PLAYER_TWO:
			return playerTwo != null;
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
		result.append(" (lobbyID: ");
		result.append(lobbyID);
		result.append(')');
		return result.toString();
	}

} //LobbyImpl
