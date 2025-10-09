/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lobby</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.Lobby#getLobbyID <em>Lobby ID</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerOne <em>Player One</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerTwo <em>Player Two</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getLobby()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlayerOneAndPlayerTwoMustHaveOppositeColor'"
 * @generated
 */
public interface Lobby extends EObject {
	/**
	 * Returns the value of the '<em><b>Lobby ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby ID</em>' attribute.
	 * @see #setLobbyID(String)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getLobby_LobbyID()
	 * @model
	 * @generated
	 */
	String getLobbyID();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Lobby#getLobbyID <em>Lobby ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby ID</em>' attribute.
	 * @see #getLobbyID()
	 * @generated
	 */
	void setLobbyID(String value);

	/**
	 * Returns the value of the '<em><b>Player One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player One</em>' containment reference.
	 * @see #setPlayerOne(Player)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getLobby_PlayerOne()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getPlayerOne();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerOne <em>Player One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player One</em>' containment reference.
	 * @see #getPlayerOne()
	 * @generated
	 */
	void setPlayerOne(Player value);

	/**
	 * Returns the value of the '<em><b>Player Two</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Two</em>' containment reference.
	 * @see #setPlayerTwo(Player)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getLobby_PlayerTwo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getPlayerTwo();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerTwo <em>Player Two</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Two</em>' containment reference.
	 * @see #getPlayerTwo()
	 * @generated
	 */
	void setPlayerTwo(Player value);

} // Lobby
