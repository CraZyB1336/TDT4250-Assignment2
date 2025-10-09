/**
 */
package no.ntnu.tdt4250.ass2.impl;

import no.ntnu.tdt4250.ass2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ass2FactoryImpl extends EFactoryImpl implements Ass2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ass2Factory init() {
		try {
			Ass2Factory theAss2Factory = (Ass2Factory) EPackage.Registry.INSTANCE.getEFactory(Ass2Package.eNS_URI);
			if (theAss2Factory != null) {
				return theAss2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ass2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ass2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ass2Package.BOARD:
			return createBoard();
		case Ass2Package.GAME:
			return createGame();
		case Ass2Package.LOBBY:
			return createLobby();
		case Ass2Package.PLAYER:
			return createPlayer();
		case Ass2Package.CHESS_PIECE:
			return createChessPiece();
		case Ass2Package.ABILITY:
			return createAbility();
		case Ass2Package.MOVE_DEFINITION:
			return createMoveDefinition();
		case Ass2Package.FLAGS:
			return createFlags();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Ass2Package.BOARD_TYPE:
			return createBoardTypeFromString(eDataType, initialValue);
		case Ass2Package.PLAYER_COLOR:
			return createPlayerColorFromString(eDataType, initialValue);
		case Ass2Package.ABILITY_TYPE:
			return createAbilityTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Ass2Package.BOARD_TYPE:
			return convertBoardTypeToString(eDataType, instanceValue);
		case Ass2Package.PLAYER_COLOR:
			return convertPlayerColorToString(eDataType, instanceValue);
		case Ass2Package.ABILITY_TYPE:
			return convertAbilityTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lobby createLobby() {
		LobbyImpl lobby = new LobbyImpl();
		return lobby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChessPiece createChessPiece() {
		ChessPieceImpl chessPiece = new ChessPieceImpl();
		return chessPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveDefinition createMoveDefinition() {
		MoveDefinitionImpl moveDefinition = new MoveDefinitionImpl();
		return moveDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flags createFlags() {
		FlagsImpl flags = new FlagsImpl();
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardType createBoardTypeFromString(EDataType eDataType, String initialValue) {
		BoardType result = BoardType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerColor createPlayerColorFromString(EDataType eDataType, String initialValue) {
		PlayerColor result = PlayerColor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityType createAbilityTypeFromString(EDataType eDataType, String initialValue) {
		AbilityType result = AbilityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ass2Package getAss2Package() {
		return (Ass2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ass2Package getPackage() {
		return Ass2Package.eINSTANCE;
	}

} //Ass2FactoryImpl
