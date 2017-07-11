/**
 */
package org.eclipse.sirius.project.propdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.Formula#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getFormula()
 * @model abstract="true"
 * @generated
 */
public interface Formula extends EObject {

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(Boolean)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getFormula_Root()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.Formula#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Boolean value);
} // Formula
