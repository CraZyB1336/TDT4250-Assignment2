/**
 */
package no.ntnu.tdt4250.ass2.impl;

import java.util.Collection;

import no.ntnu.tdt4250.ass2.Ability;
import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.ChessPiece;
import no.ntnu.tdt4250.ass2.MoveDefinition;
import no.ntnu.tdt4250.ass2.Player;
import no.ntnu.tdt4250.ass2.PlayerColor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chess Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getY <em>Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getPieceColor <em>Piece Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getMoves <em>Moves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl#getStringPosition <em>String Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChessPieceImpl extends MinimalEObjectImpl.Container implements ChessPiece {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPieceColor() <em>Piece Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceColor()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerColor PIECE_COLOR_EDEFAULT = PlayerColor.WHITE;

	/**
	 * The cached value of the '{@link #getPieceColor() <em>Piece Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceColor()
	 * @generated
	 * @ordered
	 */
	protected PlayerColor pieceColor = PIECE_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability ability;

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
	 * The cached value of the '{@link #getMoves() <em>Moves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<MoveDefinition> moves;

	/**
	 * The default value of the '{@link #getStringPosition() <em>String Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_POSITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChessPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.CHESS_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerColor getPieceColor() {
		return pieceColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPieceColor(PlayerColor newPieceColor) {
		PlayerColor oldPieceColor = pieceColor;
		pieceColor = newPieceColor == null ? PIECE_COLOR_EDEFAULT : newPieceColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__PIECE_COLOR, oldPieceColor,
					pieceColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject) player;
			player = (Player) eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ass2Package.CHESS_PIECE__PLAYER,
							oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(Player newPlayer, NotificationChain msgs) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ass2Package.CHESS_PIECE__PLAYER, oldPlayer, newPlayer);
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
	public void setPlayer(Player newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject) player).eInverseRemove(this, Ass2Package.PLAYER__PIECES, Player.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject) newPlayer).eInverseAdd(this, Ass2Package.PLAYER__PIECES, Player.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__PLAYER, newPlayer,
					newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ability getAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbility(Ability newAbility, NotificationChain msgs) {
		Ability oldAbility = ability;
		ability = newAbility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ass2Package.CHESS_PIECE__ABILITY, oldAbility, newAbility);
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
	public void setAbility(Ability newAbility) {
		if (newAbility != ability) {
			NotificationChain msgs = null;
			if (ability != null)
				msgs = ((InternalEObject) ability).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.CHESS_PIECE__ABILITY, null, msgs);
			if (newAbility != null)
				msgs = ((InternalEObject) newAbility).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ass2Package.CHESS_PIECE__ABILITY, null, msgs);
			msgs = basicSetAbility(newAbility, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__ABILITY, newAbility,
					newAbility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.CHESS_PIECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MoveDefinition> getMoves() {
		if (moves == null) {
			moves = new EObjectContainmentEList<MoveDefinition>(MoveDefinition.class, this,
					Ass2Package.CHESS_PIECE__MOVES);
		}
		return moves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getStringPosition() {
		return "x" + this.getX() + "y" + this.getY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.CHESS_PIECE__PLAYER:
			if (player != null)
				msgs = ((InternalEObject) player).eInverseRemove(this, Ass2Package.PLAYER__PIECES, Player.class, msgs);
			return basicSetPlayer((Player) otherEnd, msgs);
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
		case Ass2Package.CHESS_PIECE__PLAYER:
			return basicSetPlayer(null, msgs);
		case Ass2Package.CHESS_PIECE__ABILITY:
			return basicSetAbility(null, msgs);
		case Ass2Package.CHESS_PIECE__MOVES:
			return ((InternalEList<?>) getMoves()).basicRemove(otherEnd, msgs);
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
		case Ass2Package.CHESS_PIECE__X:
			return getX();
		case Ass2Package.CHESS_PIECE__Y:
			return getY();
		case Ass2Package.CHESS_PIECE__PIECE_COLOR:
			return getPieceColor();
		case Ass2Package.CHESS_PIECE__PLAYER:
			if (resolve)
				return getPlayer();
			return basicGetPlayer();
		case Ass2Package.CHESS_PIECE__ABILITY:
			return getAbility();
		case Ass2Package.CHESS_PIECE__NAME:
			return getName();
		case Ass2Package.CHESS_PIECE__MOVES:
			return getMoves();
		case Ass2Package.CHESS_PIECE__STRING_POSITION:
			return getStringPosition();
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
		case Ass2Package.CHESS_PIECE__X:
			setX((Integer) newValue);
			return;
		case Ass2Package.CHESS_PIECE__Y:
			setY((Integer) newValue);
			return;
		case Ass2Package.CHESS_PIECE__PIECE_COLOR:
			setPieceColor((PlayerColor) newValue);
			return;
		case Ass2Package.CHESS_PIECE__PLAYER:
			setPlayer((Player) newValue);
			return;
		case Ass2Package.CHESS_PIECE__ABILITY:
			setAbility((Ability) newValue);
			return;
		case Ass2Package.CHESS_PIECE__NAME:
			setName((String) newValue);
			return;
		case Ass2Package.CHESS_PIECE__MOVES:
			getMoves().clear();
			getMoves().addAll((Collection<? extends MoveDefinition>) newValue);
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
		case Ass2Package.CHESS_PIECE__X:
			setX(X_EDEFAULT);
			return;
		case Ass2Package.CHESS_PIECE__Y:
			setY(Y_EDEFAULT);
			return;
		case Ass2Package.CHESS_PIECE__PIECE_COLOR:
			setPieceColor(PIECE_COLOR_EDEFAULT);
			return;
		case Ass2Package.CHESS_PIECE__PLAYER:
			setPlayer((Player) null);
			return;
		case Ass2Package.CHESS_PIECE__ABILITY:
			setAbility((Ability) null);
			return;
		case Ass2Package.CHESS_PIECE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ass2Package.CHESS_PIECE__MOVES:
			getMoves().clear();
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
		case Ass2Package.CHESS_PIECE__X:
			return x != X_EDEFAULT;
		case Ass2Package.CHESS_PIECE__Y:
			return y != Y_EDEFAULT;
		case Ass2Package.CHESS_PIECE__PIECE_COLOR:
			return pieceColor != PIECE_COLOR_EDEFAULT;
		case Ass2Package.CHESS_PIECE__PLAYER:
			return player != null;
		case Ass2Package.CHESS_PIECE__ABILITY:
			return ability != null;
		case Ass2Package.CHESS_PIECE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ass2Package.CHESS_PIECE__MOVES:
			return moves != null && !moves.isEmpty();
		case Ass2Package.CHESS_PIECE__STRING_POSITION:
			return STRING_POSITION_EDEFAULT == null ? getStringPosition() != null
					: !STRING_POSITION_EDEFAULT.equals(getStringPosition());
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", pieceColor: ");
		result.append(pieceColor);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ChessPieceImpl
