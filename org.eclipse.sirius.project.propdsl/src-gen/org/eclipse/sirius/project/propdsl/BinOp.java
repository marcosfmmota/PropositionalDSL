/**
 */
package org.eclipse.sirius.project.propdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.BinOp#getBtype <em>Btype</em>}</li>
 *   <li>{@link org.eclipse.sirius.project.propdsl.BinOp#getBformula <em>Bformula</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getBinOp()
 * @model
 * @generated
 */
public interface BinOp extends Formula {
	/**
	 * Returns the value of the '<em><b>Btype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.project.propdsl.BinOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btype</em>' attribute.
	 * @see org.eclipse.sirius.project.propdsl.BinOperator
	 * @see #setBtype(BinOperator)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getBinOp_Btype()
	 * @model
	 * @generated
	 */
	BinOperator getBtype();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.BinOp#getBtype <em>Btype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btype</em>' attribute.
	 * @see org.eclipse.sirius.project.propdsl.BinOperator
	 * @see #getBtype()
	 * @generated
	 */
	void setBtype(BinOperator value);

	/**
	 * Returns the value of the '<em><b>Bformula</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.project.propdsl.Formula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bformula</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bformula</em>' reference list.
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getBinOp_Bformula()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Formula> getBformula();

} // BinOp
