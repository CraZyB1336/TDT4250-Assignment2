/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ass2.Ass2Factory
 * @model kind="package"
 * @generated
 */
public interface Ass2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ass2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/ass2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ass2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ass2Package eINSTANCE = no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.BoardImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 0;

	/**
	 * The feature id for the '<em><b>Board Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>White Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__WHITE_PIECES = 2;

	/**
	 * The feature id for the '<em><b>Black Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BLACK_PIECES = 3;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.GameImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getGame()
	 * @generated
	 */
	int GAME = 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Lobby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__LOBBY = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.LobbyImpl <em>Lobby</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.LobbyImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getLobby()
	 * @generated
	 */
	int LOBBY = 2;

	/**
	 * The feature id for the '<em><b>Lobby ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY__LOBBY_ID = 0;

	/**
	 * The feature id for the '<em><b>Player One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY__PLAYER_ONE = 1;

	/**
	 * The feature id for the '<em><b>Player Two</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY__PLAYER_TWO = 2;

	/**
	 * The number of structural features of the '<em>Lobby</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lobby</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.PlayerImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PIECES = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl <em>Chess Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.ChessPieceImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getChessPiece()
	 * @generated
	 */
	int CHESS_PIECE = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__Y = 1;

	/**
	 * The feature id for the '<em><b>Piece Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__PIECE_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__ABILITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__MOVES = 6;

	/**
	 * The feature id for the '<em><b>Piece Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE__PIECE_FLAGS = 7;

	/**
	 * The number of structural features of the '<em>Chess Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Chess Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESS_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.AbilityImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NEW_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Cool Down Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__COOL_DOWN_COUNTER = 2;

	/**
	 * The feature id for the '<em><b>Cool Down Start Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__COOL_DOWN_START_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__FLAGS = 4;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl <em>Move Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getMoveDefinition()
	 * @generated
	 */
	int MOVE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Move X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION__MOVE_X = 0;

	/**
	 * The feature id for the '<em><b>Move Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION__MOVE_Y = 1;

	/**
	 * The feature id for the '<em><b>Is Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION__IS_INFINITE = 2;

	/**
	 * The feature id for the '<em><b>Can Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION__CAN_JUMP = 3;

	/**
	 * The number of structural features of the '<em>Move Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Move Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.impl.FlagsImpl <em>Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.impl.FlagsImpl
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getFlags()
	 * @generated
	 */
	int FLAGS = 7;

	/**
	 * The feature id for the '<em><b>Flag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAGS__FLAG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAGS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.BoardType <em>Board Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.BoardType
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getBoardType()
	 * @generated
	 */
	int BOARD_TYPE = 8;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.PlayerColor <em>Player Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getPlayerColor()
	 * @generated
	 */
	int PLAYER_COLOR = 9;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ass2.AbilityType <em>Ability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ass2.AbilityType
	 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getAbilityType()
	 * @generated
	 */
	int ABILITY_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.ass2.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Board#getBoardSize <em>Board Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Size</em>'.
	 * @see no.ntnu.tdt4250.ass2.Board#getBoardSize()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardSize();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Board#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see no.ntnu.tdt4250.ass2.Board#getBoardType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardType();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ass2.Board#getWhitePieces <em>White Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>White Pieces</em>'.
	 * @see no.ntnu.tdt4250.ass2.Board#getWhitePieces()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_WhitePieces();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ass2.Board#getBlackPieces <em>Black Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Black Pieces</em>'.
	 * @see no.ntnu.tdt4250.ass2.Board#getBlackPieces()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_BlackPieces();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.ntnu.tdt4250.ass2.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.ass2.Game#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.ass2.Game#getBoard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Board();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.ass2.Game#getLobby <em>Lobby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lobby</em>'.
	 * @see no.ntnu.tdt4250.ass2.Game#getLobby()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Lobby();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Lobby <em>Lobby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lobby</em>'.
	 * @see no.ntnu.tdt4250.ass2.Lobby
	 * @generated
	 */
	EClass getLobby();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Lobby#getLobbyID <em>Lobby ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby ID</em>'.
	 * @see no.ntnu.tdt4250.ass2.Lobby#getLobbyID()
	 * @see #getLobby()
	 * @generated
	 */
	EAttribute getLobby_LobbyID();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerOne <em>Player One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player One</em>'.
	 * @see no.ntnu.tdt4250.ass2.Lobby#getPlayerOne()
	 * @see #getLobby()
	 * @generated
	 */
	EReference getLobby_PlayerOne();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.ass2.Lobby#getPlayerTwo <em>Player Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Two</em>'.
	 * @see no.ntnu.tdt4250.ass2.Lobby#getPlayerTwo()
	 * @see #getLobby()
	 * @generated
	 */
	EReference getLobby_PlayerTwo();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.ass2.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ass2.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Player#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see no.ntnu.tdt4250.ass2.Player#getColor()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Color();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.ass2.Player#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pieces</em>'.
	 * @see no.ntnu.tdt4250.ass2.Player#getPieces()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Pieces();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.ChessPiece <em>Chess Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chess Piece</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece
	 * @generated
	 */
	EClass getChessPiece();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.ChessPiece#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getX()
	 * @see #getChessPiece()
	 * @generated
	 */
	EAttribute getChessPiece_X();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.ChessPiece#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getY()
	 * @see #getChessPiece()
	 * @generated
	 */
	EAttribute getChessPiece_Y();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPieceColor <em>Piece Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piece Color</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getPieceColor()
	 * @see #getChessPiece()
	 * @generated
	 */
	EAttribute getChessPiece_PieceColor();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getPlayer()
	 * @see #getChessPiece()
	 * @generated
	 */
	EReference getChessPiece_Player();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.ass2.ChessPiece#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ability</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getAbility()
	 * @see #getChessPiece()
	 * @generated
	 */
	EReference getChessPiece_Ability();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.ChessPiece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getName()
	 * @see #getChessPiece()
	 * @generated
	 */
	EAttribute getChessPiece_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ass2.ChessPiece#getMoves <em>Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moves</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getMoves()
	 * @see #getChessPiece()
	 * @generated
	 */
	EReference getChessPiece_Moves();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ass2.ChessPiece#getPieceFlags <em>Piece Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piece Flags</em>'.
	 * @see no.ntnu.tdt4250.ass2.ChessPiece#getPieceFlags()
	 * @see #getChessPiece()
	 * @generated
	 */
	EReference getChessPiece_PieceFlags();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Ability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability#getName()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Ability#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability#getNewAttribute()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_NewAttribute();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownCounter <em>Cool Down Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cool Down Counter</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability#getCoolDownCounter()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_CoolDownCounter();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Ability#getCoolDownStartNumber <em>Cool Down Start Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cool Down Start Number</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability#getCoolDownStartNumber()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_CoolDownStartNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ass2.Ability#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flags</em>'.
	 * @see no.ntnu.tdt4250.ass2.Ability#getFlags()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Flags();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.MoveDefinition <em>Move Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Definition</em>'.
	 * @see no.ntnu.tdt4250.ass2.MoveDefinition
	 * @generated
	 */
	EClass getMoveDefinition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveX <em>Move X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move X</em>'.
	 * @see no.ntnu.tdt4250.ass2.MoveDefinition#getMoveX()
	 * @see #getMoveDefinition()
	 * @generated
	 */
	EAttribute getMoveDefinition_MoveX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveY <em>Move Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Y</em>'.
	 * @see no.ntnu.tdt4250.ass2.MoveDefinition#getMoveY()
	 * @see #getMoveDefinition()
	 * @generated
	 */
	EAttribute getMoveDefinition_MoveY();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isIsInfinite <em>Is Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Infinite</em>'.
	 * @see no.ntnu.tdt4250.ass2.MoveDefinition#isIsInfinite()
	 * @see #getMoveDefinition()
	 * @generated
	 */
	EAttribute getMoveDefinition_IsInfinite();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanJump <em>Can Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Jump</em>'.
	 * @see no.ntnu.tdt4250.ass2.MoveDefinition#isCanJump()
	 * @see #getMoveDefinition()
	 * @generated
	 */
	EAttribute getMoveDefinition_CanJump();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ass2.Flags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flags</em>'.
	 * @see no.ntnu.tdt4250.ass2.Flags
	 * @generated
	 */
	EClass getFlags();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Flags#getFlagName <em>Flag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Name</em>'.
	 * @see no.ntnu.tdt4250.ass2.Flags#getFlagName()
	 * @see #getFlags()
	 * @generated
	 */
	EAttribute getFlags_FlagName();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ass2.Flags#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.ntnu.tdt4250.ass2.Flags#isValue()
	 * @see #getFlags()
	 * @generated
	 */
	EAttribute getFlags_Value();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.ass2.BoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Type</em>'.
	 * @see no.ntnu.tdt4250.ass2.BoardType
	 * @generated
	 */
	EEnum getBoardType();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.ass2.PlayerColor <em>Player Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Color</em>'.
	 * @see no.ntnu.tdt4250.ass2.PlayerColor
	 * @generated
	 */
	EEnum getPlayerColor();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.ass2.AbilityType <em>Ability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ability Type</em>'.
	 * @see no.ntnu.tdt4250.ass2.AbilityType
	 * @generated
	 */
	EEnum getAbilityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ass2Factory getAss2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.BoardImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Board Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__BOARD_SIZE = eINSTANCE.getBoard_BoardSize();

		/**
		 * The meta object literal for the '<em><b>Board Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__BOARD_TYPE = eINSTANCE.getBoard_BoardType();

		/**
		 * The meta object literal for the '<em><b>White Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__WHITE_PIECES = eINSTANCE.getBoard_WhitePieces();

		/**
		 * The meta object literal for the '<em><b>Black Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__BLACK_PIECES = eINSTANCE.getBoard_BlackPieces();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.GameImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BOARD = eINSTANCE.getGame_Board();

		/**
		 * The meta object literal for the '<em><b>Lobby</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__LOBBY = eINSTANCE.getGame_Lobby();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.LobbyImpl <em>Lobby</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.LobbyImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getLobby()
		 * @generated
		 */
		EClass LOBBY = eINSTANCE.getLobby();

		/**
		 * The meta object literal for the '<em><b>Lobby ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY__LOBBY_ID = eINSTANCE.getLobby_LobbyID();

		/**
		 * The meta object literal for the '<em><b>Player One</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOBBY__PLAYER_ONE = eINSTANCE.getLobby_PlayerOne();

		/**
		 * The meta object literal for the '<em><b>Player Two</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOBBY__PLAYER_TWO = eINSTANCE.getLobby_PlayerTwo();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.PlayerImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COLOR = eINSTANCE.getPlayer_Color();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PIECES = eINSTANCE.getPlayer_Pieces();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.ChessPieceImpl <em>Chess Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.ChessPieceImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getChessPiece()
		 * @generated
		 */
		EClass CHESS_PIECE = eINSTANCE.getChessPiece();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS_PIECE__X = eINSTANCE.getChessPiece_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS_PIECE__Y = eINSTANCE.getChessPiece_Y();

		/**
		 * The meta object literal for the '<em><b>Piece Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS_PIECE__PIECE_COLOR = eINSTANCE.getChessPiece_PieceColor();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS_PIECE__PLAYER = eINSTANCE.getChessPiece_Player();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS_PIECE__ABILITY = eINSTANCE.getChessPiece_Ability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHESS_PIECE__NAME = eINSTANCE.getChessPiece_Name();

		/**
		 * The meta object literal for the '<em><b>Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS_PIECE__MOVES = eINSTANCE.getChessPiece_Moves();

		/**
		 * The meta object literal for the '<em><b>Piece Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHESS_PIECE__PIECE_FLAGS = eINSTANCE.getChessPiece_PieceFlags();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.AbilityImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__NAME = eINSTANCE.getAbility_Name();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__NEW_ATTRIBUTE = eINSTANCE.getAbility_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Cool Down Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__COOL_DOWN_COUNTER = eINSTANCE.getAbility_CoolDownCounter();

		/**
		 * The meta object literal for the '<em><b>Cool Down Start Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__COOL_DOWN_START_NUMBER = eINSTANCE.getAbility_CoolDownStartNumber();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__FLAGS = eINSTANCE.getAbility_Flags();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl <em>Move Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.MoveDefinitionImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getMoveDefinition()
		 * @generated
		 */
		EClass MOVE_DEFINITION = eINSTANCE.getMoveDefinition();

		/**
		 * The meta object literal for the '<em><b>Move X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_DEFINITION__MOVE_X = eINSTANCE.getMoveDefinition_MoveX();

		/**
		 * The meta object literal for the '<em><b>Move Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_DEFINITION__MOVE_Y = eINSTANCE.getMoveDefinition_MoveY();

		/**
		 * The meta object literal for the '<em><b>Is Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_DEFINITION__IS_INFINITE = eINSTANCE.getMoveDefinition_IsInfinite();

		/**
		 * The meta object literal for the '<em><b>Can Jump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_DEFINITION__CAN_JUMP = eINSTANCE.getMoveDefinition_CanJump();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.impl.FlagsImpl <em>Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.impl.FlagsImpl
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getFlags()
		 * @generated
		 */
		EClass FLAGS = eINSTANCE.getFlags();

		/**
		 * The meta object literal for the '<em><b>Flag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAGS__FLAG_NAME = eINSTANCE.getFlags_FlagName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAGS__VALUE = eINSTANCE.getFlags_Value();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.BoardType <em>Board Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.BoardType
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getBoardType()
		 * @generated
		 */
		EEnum BOARD_TYPE = eINSTANCE.getBoardType();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.PlayerColor <em>Player Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.PlayerColor
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getPlayerColor()
		 * @generated
		 */
		EEnum PLAYER_COLOR = eINSTANCE.getPlayerColor();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ass2.AbilityType <em>Ability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ass2.AbilityType
		 * @see no.ntnu.tdt4250.ass2.impl.Ass2PackageImpl#getAbilityType()
		 * @generated
		 */
		EEnum ABILITY_TYPE = eINSTANCE.getAbilityType();

	}

} //Ass2Package
