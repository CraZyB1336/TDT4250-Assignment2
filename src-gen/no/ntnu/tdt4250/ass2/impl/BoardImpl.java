/**
 */
package no.ntnu.tdt4250.ass2.impl;

import java.util.Collection;

import no.ntnu.tdt4250.ass2.Ass2Package;
import no.ntnu.tdt4250.ass2.Board;
import no.ntnu.tdt4250.ass2.BoardType;
import no.ntnu.tdt4250.ass2.ChessPiece;

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
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.BoardImpl#getBoardSize <em>Board Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.BoardImpl#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.BoardImpl#getWhitePieces <em>White Pieces</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.impl.BoardImpl#getBlackPieces <em>Black Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The default value of the '{@link #getBoardSize() <em>Board Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BOARD_SIZE_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getBoardSize() <em>Board Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardSize()
	 * @generated
	 * @ordered
	 */
	protected int boardSize = BOARD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected static final BoardType BOARD_TYPE_EDEFAULT = BoardType.CLASSIC;

	/**
	 * The cached value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected BoardType boardType = BOARD_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhitePieces() <em>White Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitePieces()
	 * @generated
	 * @ordered
	 */
	protected EList<ChessPiece> whitePieces;

	/**
	 * The cached value of the '{@link #getBlackPieces() <em>Black Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<ChessPiece> blackPieces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ass2Package.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBoardSize() {
		return boardSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoardSize(int newBoardSize) {
		int oldBoardSize = boardSize;
		boardSize = newBoardSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.BOARD__BOARD_SIZE, oldBoardSize,
					boardSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoardType getBoardType() {
		return boardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoardType(BoardType newBoardType) {
		BoardType oldBoardType = boardType;
		boardType = newBoardType == null ? BOARD_TYPE_EDEFAULT : newBoardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ass2Package.BOARD__BOARD_TYPE, oldBoardType,
					boardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChessPiece> getWhitePieces() {
		if (whitePieces == null) {
			whitePieces = new EObjectContainmentEList<ChessPiece>(ChessPiece.class, this,
					Ass2Package.BOARD__WHITE_PIECES);
		}
		return whitePieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChessPiece> getBlackPieces() {
		if (blackPieces == null) {
			blackPieces = new EObjectContainmentEList<ChessPiece>(ChessPiece.class, this,
					Ass2Package.BOARD__BLACK_PIECES);
		}
		return blackPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ass2Package.BOARD__WHITE_PIECES:
			return ((InternalEList<?>) getWhitePieces()).basicRemove(otherEnd, msgs);
		case Ass2Package.BOARD__BLACK_PIECES:
			return ((InternalEList<?>) getBlackPieces()).basicRemove(otherEnd, msgs);
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
		case Ass2Package.BOARD__BOARD_SIZE:
			return getBoardSize();
		case Ass2Package.BOARD__BOARD_TYPE:
			return getBoardType();
		case Ass2Package.BOARD__WHITE_PIECES:
			return getWhitePieces();
		case Ass2Package.BOARD__BLACK_PIECES:
			return getBlackPieces();
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
		case Ass2Package.BOARD__BOARD_SIZE:
			setBoardSize((Integer) newValue);
			return;
		case Ass2Package.BOARD__BOARD_TYPE:
			setBoardType((BoardType) newValue);
			return;
		case Ass2Package.BOARD__WHITE_PIECES:
			getWhitePieces().clear();
			getWhitePieces().addAll((Collection<? extends ChessPiece>) newValue);
			return;
		case Ass2Package.BOARD__BLACK_PIECES:
			getBlackPieces().clear();
			getBlackPieces().addAll((Collection<? extends ChessPiece>) newValue);
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
		case Ass2Package.BOARD__BOARD_SIZE:
			setBoardSize(BOARD_SIZE_EDEFAULT);
			return;
		case Ass2Package.BOARD__BOARD_TYPE:
			setBoardType(BOARD_TYPE_EDEFAULT);
			return;
		case Ass2Package.BOARD__WHITE_PIECES:
			getWhitePieces().clear();
			return;
		case Ass2Package.BOARD__BLACK_PIECES:
			getBlackPieces().clear();
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
		case Ass2Package.BOARD__BOARD_SIZE:
			return boardSize != BOARD_SIZE_EDEFAULT;
		case Ass2Package.BOARD__BOARD_TYPE:
			return boardType != BOARD_TYPE_EDEFAULT;
		case Ass2Package.BOARD__WHITE_PIECES:
			return whitePieces != null && !whitePieces.isEmpty();
		case Ass2Package.BOARD__BLACK_PIECES:
			return blackPieces != null && !blackPieces.isEmpty();
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
		result.append(" (boardSize: ");
		result.append(boardSize);
		result.append(", boardType: ");
		result.append(boardType);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
