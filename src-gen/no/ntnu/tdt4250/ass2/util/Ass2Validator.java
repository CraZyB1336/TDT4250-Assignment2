/**
 */
package no.ntnu.tdt4250.ass2.util;

import java.util.Map;
import java.util.HashSet;

import no.ntnu.tdt4250.ass2.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ass2.Ass2Package
 * @generated
 */
public class Ass2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Ass2Validator INSTANCE = new Ass2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.ass2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ass2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Ass2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Ass2Package.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case Ass2Package.GAME:
			return validateGame((Game) value, diagnostics, context);
		case Ass2Package.LOBBY:
			return validateLobby((Lobby) value, diagnostics, context);
		case Ass2Package.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case Ass2Package.CHESS_PIECE:
			return validateChessPiece((ChessPiece) value, diagnostics, context);
		case Ass2Package.ABILITY:
			return validateAbility((Ability) value, diagnostics, context);
		case Ass2Package.MOVE_DEFINITION:
			return validateMoveDefinition((MoveDefinition) value, diagnostics, context);
		case Ass2Package.BOARD_TYPE:
			return validateBoardType((BoardType) value, diagnostics, context);
		case Ass2Package.PLAYER_COLOR:
			return validatePlayerColor((PlayerColor) value, diagnostics, context);
		case Ass2Package.ABILITY_TYPE:
			return validateAbilityType((AbilityType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(board, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_BlackPiecesMustBeColorBlack(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_WhitePiecesMustBeColorWhite(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_AllChessPiecesMustBeOnUniqueSquares(board, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BlackPiecesMustBeColorBlack constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateBoard_BlackPiecesMustBeColorBlack(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		
		for (ChessPiece piece : board.getBlackPieces()) {
			if (piece.getPieceColor() == PlayerColor.WHITE) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "BlackPiecesMustBeColorBlack", getObjectLabel(board, context) },
								new Object[] { board }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WhitePiecesMustBeColorWhite constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateBoard_WhitePiecesMustBeColorWhite(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		
		for (ChessPiece piece : board.getWhitePieces()) {
			if (piece.getPieceColor() == PlayerColor.BLACK) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "WhitePiecesMustBeColorWhite", getObjectLabel(board, context) },
								new Object[] { board }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AllChessPiecesMustBeOnUniqueSquares constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateBoard_AllChessPiecesMustBeOnUniqueSquares(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		HashSet<String> takenPositions = new HashSet<>();
		
		// Check black positions
		for (ChessPiece piece : board.getBlackPieces()) {
			String positionAsString = "x" + piece.getX() + "y" + piece.getY();
			
			if (takenPositions.contains(positionAsString)) {
				valid = false;
				break;
			}
		}
		
		// Check white positions
		for (ChessPiece piece : board.getWhitePieces()) {
			String positionAsString = "x" + piece.getX() + "y" + piece.getY();
			
			if (takenPositions.contains(positionAsString)) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "AllChessPiecesMustBeOnUniqueSquares", getObjectLabel(board, context) },
								new Object[] { board }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLobby(Lobby lobby, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lobby, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lobby, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLobby_PlayerOneAndPlayerTwoMustHaveOppositeColor(lobby, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PlayerOneAndPlayerTwoMustHaveOppositeColor constraint of '<em>Lobby</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateLobby_PlayerOneAndPlayerTwoMustHaveOppositeColor(Lobby lobby, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		
		if (lobby.getPlayerOne().getColor() == lobby.getPlayerTwo().getColor()) {
			valid = false;
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "PlayerOneAndPlayerTwoMustHaveOppositeColor", getObjectLabel(lobby, context) },
						new Object[] { lobby }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChessPiece(ChessPiece chessPiece, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chessPiece, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(chessPiece, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateChessPiece_PieceColorMustBeSameAsPlayer(chessPiece, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PieceColorMustBeSameAsPlayer constraint of '<em>Chess Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateChessPiece_PieceColorMustBeSameAsPlayer(ChessPiece chessPiece, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		
		if (chessPiece.getPieceColor() != chessPiece.getPlayer().getColor()) {
			valid = false;
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "PieceColorMustBeSameAsPlayer", getObjectLabel(chessPiece, context) },
								new Object[] { chessPiece }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility(Ability ability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoveDefinition(MoveDefinition moveDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoardType(BoardType boardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerColor(PlayerColor playerColor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbilityType(AbilityType abilityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Ass2Validator
