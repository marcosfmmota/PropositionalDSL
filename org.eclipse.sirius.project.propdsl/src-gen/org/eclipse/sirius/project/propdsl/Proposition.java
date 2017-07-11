/**
 */
package org.eclipse.sirius.project.propdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.Proposition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getProposition()
 * @model
 * @generated
 */
public interface Proposition extends Formula {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.project.propdsl.PropdslPackage#getProposition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.project.propdsl.Proposition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Proposition
