/**
 */
package no.ntnu.tdt4250.ass2.impl;

import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.Board;
import no.ntnu.tdt4250.ass2.Game;
import no.ntnu.tdt4250.ass2.Lobby;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.GameImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.GameImpl#getLobby <em>Lobby</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getLobby() <em>Lobby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobby()
	 * @generated
	 * @ordered
	 */
	protected Lobby lobby;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ass2Package.GAME__BOARD,
					oldBoard, newBoard);
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
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ass2Package.GAME__BOARD,
						null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ass2Package.GAME__BOARD,
						null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.GAME__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lobby getLobby() {
		return lobby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLobby(Lobby newLobby, NotificationChain msgs) {
		Lobby oldLobby = lobby;
		lobby = newLobby;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ass2Package.GAME__LOBBY,
					oldLobby, newLobby);
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
	public void setLobby(Lobby newLobby) {
		if (newLobby != lobby) {
			NotificationChain msgs = null;
			if (lobby != null)
				msgs = ((InternalEObject) lobby).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ass2Package.GAME__LOBBY,
						null, msgs);
			if (newLobby != null)
				msgs = ((InternalEObject) newLobby).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ass2Package.GAME__LOBBY,
						null, msgs);
			msgs = basicSetLobby(newLobby, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.GAME__LOBBY, newLobby, newLobby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.GAME__BOARD:
			return basicSetBoard(null, msgs);
		case Ass2Package.GAME__LOBBY:
			return basicSetLobby(null, msgs);
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
		case Ass2Package.GAME__BOARD:
			return getBoard();
		case Ass2Package.GAME__LOBBY:
			return getLobby();
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
		case Ass2Package.GAME__BOARD:
			setBoard((Board) newValue);
			return;
		case Ass2Package.GAME__LOBBY:
			setLobby((Lobby) newValue);
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
		case Ass2Package.GAME__BOARD:
			setBoard((Board) null);
			return;
		case Ass2Package.GAME__LOBBY:
			setLobby((Lobby) null);
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
		case Ass2Package.GAME__BOARD:
			return board != null;
		case Ass2Package.GAME__LOBBY:
			return lobby != null;
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
