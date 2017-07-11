/**
 */
package org.eclipse.sirius.project.propdsl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.Expression#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.project.propdsl.Expression#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getExpression_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.Expression#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.project.propdsl.Formula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference list.
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getExpression_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formula> getFormula();

} // Expression
