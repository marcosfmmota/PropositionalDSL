/**
 */
package org.eclipse.sirius.project.propdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.UnOp#getUtype <em>Utype</em>}</li>
 *   <li>{@link org.eclipse.sirius.project.propdsl.UnOp#getUformula <em>Uformula</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getUnOp()
 * @model
 * @generated
 */
public interface UnOp extends Formula {
	/**
	 * Returns the value of the '<em><b>Utype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.project.propdsl.UnOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utype</em>' attribute.
	 * @see org.eclipse.sirius.project.propdsl.UnOperator
	 * @see #setUtype(UnOperator)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getUnOp_Utype()
	 * @model
	 * @generated
	 */
	UnOperator getUtype();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.UnOp#getUtype <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utype</em>' attribute.
	 * @see org.eclipse.sirius.project.propdsl.UnOperator
	 * @see #getUtype()
	 * @generated
	 */
	void setUtype(UnOperator value);

	/**
	 * Returns the value of the '<em><b>Uformula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uformula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uformula</em>' reference.
	 * @see #setUformula(Formula)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getUnOp_Uformula()
	 * @model required="true"
	 * @generated
	 */
	Formula getUformula();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.UnOp#getUformula <em>Uformula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uformula</em>' reference.
	 * @see #getUformula()
	 * @generated
	 */
	void setUformula(Formula value);

} // UnOp
