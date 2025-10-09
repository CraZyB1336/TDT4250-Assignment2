/**
 */
package no.ntnu.tdt4250.ass2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Board Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getBoardType()
 * @model
 * @generated
 */
public enum BoardType implements Enumerator {
	/**
	 * The '<em><b>Classic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIC(0, "Classic", "Classic"),

	/**
	 * The '<em><b>Fog Of War</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOG_OF_WAR_VALUE
	 * @generated
	 * @ordered
	 */
	FOG_OF_WAR(1, "FogOfWar", "FogOfWar");

	/**
	 * The '<em><b>Classic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC
	 * @model name="Classic"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIC_VALUE = 0;

	/**
	 * The '<em><b>Fog Of War</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOG_OF_WAR
	 * @model name="FogOfWar"
	 * @generated
	 * @ordered
	 */
	public static final int FOG_OF_WAR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Board Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BoardType[] VALUES_ARRAY = new BoardType[] { CLASSIC, FOG_OF_WAR, };

	/**
	 * A public read-only list of all the '<em><b>Board Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BoardType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType get(int value) {
		switch (value) {
		case CLASSIC_VALUE:
			return CLASSIC;
		case FOG_OF_WAR_VALUE:
			return FOG_OF_WAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BoardType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BoardType
