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
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanCapture <em>Can Capture</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanMoveOnly <em>Can Move Only</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isFirstMoveOnly <em>First Move Only</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanCaptureOnly <em>Can Capture Only</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IsMoveOnlyAndCanCaptureCantBothBeTrue CanCaptureAndIsCaptureOnlyMustBeSameValue'"
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

	/**
	 * Returns the value of the '<em><b>Can Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Capture</em>' attribute.
	 * @see #setCanCapture(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_CanCapture()
	 * @model required="true"
	 * @generated
	 */
	boolean isCanCapture();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanCapture <em>Can Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Capture</em>' attribute.
	 * @see #isCanCapture()
	 * @generated
	 */
	void setCanCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Move Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Move Only</em>' attribute.
	 * @see #setCanMoveOnly(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_CanMoveOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isCanMoveOnly();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanMoveOnly <em>Can Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Move Only</em>' attribute.
	 * @see #isCanMoveOnly()
	 * @generated
	 */
	void setCanMoveOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>First Move Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Move Only</em>' attribute.
	 * @see #setFirstMoveOnly(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_FirstMoveOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isFirstMoveOnly();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isFirstMoveOnly <em>First Move Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Move Only</em>' attribute.
	 * @see #isFirstMoveOnly()
	 * @generated
	 */
	void setFirstMoveOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Capture Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Capture Only</em>' attribute.
	 * @see #setCanCaptureOnly(boolean)
	 * @see no.ntnu.tdt4250.ass2.Ass2Package#getMoveDefinition_CanCaptureOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isCanCaptureOnly();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ass2.MoveDefinition#isCanCaptureOnly <em>Can Capture Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Capture Only</em>' attribute.
	 * @see #isCanCaptureOnly()
	 * @generated
	 */
	void setCanCaptureOnly(boolean value);

} // MoveDefinition
