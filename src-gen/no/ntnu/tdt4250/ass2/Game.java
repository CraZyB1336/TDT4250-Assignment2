/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Game#getLobby <em>Lobby</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getGame_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Game#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Lobby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby</em>' containment reference.
	 * @see #setLobby(Lobby)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getGame_Lobby()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lobby getLobby();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Game#getLobby <em>Lobby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby</em>' containment reference.
	 * @see #getLobby()
	 * @generated
	 */
	void setLobby(Lobby value);

} // Game
