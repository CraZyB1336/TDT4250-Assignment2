/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chess Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getY <em>Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getPieceColor <em>Piece Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getAbility <em>Ability</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getMoves <em>Moves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.ChessPiece#getPieceFlags <em>Piece Flags</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlayerColorMustBeSameAsPlayer'"
 * @generated
 */
public interface ChessPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Piece Color</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.ass2.PlayerColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Color</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @see #setPieceColor(PlayerColor)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_PieceColor()
	 * @model required="true"
	 * @generated
	 */
	PlayerColor getPieceColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPieceColor <em>Piece Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece Color</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @see #getPieceColor()
	 * @generated
	 */
	void setPieceColor(PlayerColor value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.ass2.Player#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_Player()
	 * @see no.ntnu.tdt4250.ass2.Player#getPieces
	 * @model opposite="pieces" required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Ability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' containment reference.
	 * @see #setAbility(Ability)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_Ability()
	 * @model containment="true"
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getAbility <em>Ability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' containment reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.ChessPiece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Moves</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ass2.MoveDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' reference list.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_Moves()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<MoveDefinition> getMoves();

	/**
	 * Returns the value of the '<em><b>Piece Flags</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ass2.Flags}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Flags</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getChessPiece_PieceFlags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flags> getPieceFlags();

} // ChessPiece
