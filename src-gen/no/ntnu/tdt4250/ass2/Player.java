/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Player#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Player#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Player#getPieces <em>Pieces</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.ass2.PlayerColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @see #setColor(PlayerColor)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getPlayer_Color()
	 * @model required="true"
	 * @generated
	 */
	PlayerColor getColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Player#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(PlayerColor value);

	/**
	 * Returns the value of the '<em><b>Pieces</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ass2.ChessPiece}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces</em>' reference list.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getPlayer_Pieces()
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getPlayer
	 * @model opposite="player" upper="16"
	 * @generated
	 */
	EList<ChessPiece> getPieces();

} // Player
