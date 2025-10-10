/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Board#getBoardSize <em>Board Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Board#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Board#getWhitePieces <em>White Pieces</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Board#getBlackPieces <em>Black Pieces</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Board#getTotalPieces <em>Total Pieces</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BlackPiecesMustBeColorBlack WhitePiecesMustBeColorWhite AllChessPiecesMustBeOnUniqueSquares'"
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Board Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Size</em>' attribute.
	 * @see #setBoardSize(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard_BoardSize()
	 * @model default="8" required="true" ordered="false"
	 * @generated
	 */
	int getBoardSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Board#getBoardSize <em>Board Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Size</em>' attribute.
	 * @see #getBoardSize()
	 * @generated
	 */
	void setBoardSize(int value);

	/**
	 * Returns the value of the '<em><b>Board Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.ass2.BoardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Type</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.BoardType
	 * @see #setBoardType(BoardType)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard_BoardType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BoardType getBoardType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Board#getBoardType <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Type</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.BoardType
	 * @see #getBoardType()
	 * @generated
	 */
	void setBoardType(BoardType value);

	/**
	 * Returns the value of the '<em><b>White Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ass2.ChessPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Pieces</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard_WhitePieces()
	 * @model containment="true" required="true" upper="16"
	 * @generated
	 */
	EList<ChessPiece> getWhitePieces();

	/**
	 * Returns the value of the '<em><b>Black Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ass2.ChessPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Pieces</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard_BlackPieces()
	 * @model containment="true" required="true" upper="16"
	 * @generated
	 */
	EList<ChessPiece> getBlackPieces();

	/**
	 * Returns the value of the '<em><b>Total Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Pieces</em>' attribute.
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoard_TotalPieces()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalPieces();

} // Board
