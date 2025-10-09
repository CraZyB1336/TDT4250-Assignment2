/**
 */
package no.ntnu.tdt4250.ass2.util;

import no.ntnu.tdt4250.ass2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ass2.Ass2Package
 * @generated
 */
public class Ass2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ass2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ass2Switch() {
		if (modelPackage == null) {
			modelPackage = Ass2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Ass2Package.BOARD: {
			Board board = (Board) theEObject;
			T result = caseBoard(board);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.GAME: {
			Game game = (Game) theEObject;
			T result = caseGame(game);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.LOBBY: {
			Lobby lobby = (Lobby) theEObject;
			T result = caseLobby(lobby);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.PLAYER: {
			Player player = (Player) theEObject;
			T result = casePlayer(player);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.CHESS_PIECE: {
			ChessPiece chessPiece = (ChessPiece) theEObject;
			T result = caseChessPiece(chessPiece);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.ABILITY: {
			Ability ability = (Ability) theEObject;
			T result = caseAbility(ability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.MOVE_DEFINITION: {
			MoveDefinition moveDefinition = (MoveDefinition) theEObject;
			T result = caseMoveDefinition(moveDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ass2Package.FLAGS: {
			Flags flags = (Flags) theEObject;
			T result = caseFlags(flags);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lobby</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lobby</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLobby(Lobby object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chess Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chess Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChessPiece(ChessPiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbility(Ability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveDefinition(MoveDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlags(Flags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ass2Switch
