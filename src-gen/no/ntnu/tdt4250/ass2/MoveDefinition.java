/**
 */
package no.ntnu.tdt4250.ass2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveX <em>Move X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveY <em>Move Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isIsInfinite <em>Is Infinite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanJump <em>Can Jump</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition()
 * @model
 * @generated
 */
public interface MoveDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Move X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move X</em>' attribute.
	 * @see #setMoveX(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_MoveX()
	 * @model required="true"
	 * @generated
	 */
	int getMoveX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveX <em>Move X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move X</em>' attribute.
	 * @see #getMoveX()
	 * @generated
	 */
	void setMoveX(int value);

	/**
	 * Returns the value of the '<em><b>Move Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Y</em>' attribute.
	 * @see #setMoveY(int)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_MoveY()
	 * @model required="true"
	 * @generated
	 */
	int getMoveY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#getMoveY <em>Move Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Y</em>' attribute.
	 * @see #getMoveY()
	 * @generated
	 */
	void setMoveY(int value);

	/**
	 * Returns the value of the '<em><b>Is Infinite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Infinite</em>' attribute.
	 * @see #setIsInfinite(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_IsInfinite()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsInfinite();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isIsInfinite <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Infinite</em>' attribute.
	 * @see #isIsInfinite()
	 * @generated
	 */
	void setIsInfinite(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Jump</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Jump</em>' attribute.
	 * @see #setCanJump(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_CanJump()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCanJump();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanJump <em>Can Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Jump</em>' attribute.
	 * @see #isCanJump()
	 * @generated
	 */
	void setCanJump(boolean value);

} // MoveDefinition
