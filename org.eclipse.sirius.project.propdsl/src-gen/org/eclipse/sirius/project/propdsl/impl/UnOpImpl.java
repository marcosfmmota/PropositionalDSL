/**
 */
package org.eclipse.sirius.project.propdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.project.propdsl.Formula;
import org.eclipse.sirius.project.propdsl.PropdslPackage;
import org.eclipse.sirius.project.propdsl.UnOp;
import org.eclipse.sirius.project.propdsl.UnOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Un Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.impl.UnOpImpl#getUtype <em>Utype</em>}</li>
 *   <li>{@link org.eclipse.sirius.project.propdsl.impl.UnOpImpl#getUformula <em>Uformula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnOpImpl extends FormulaImpl implements UnOp {
	/**
	 * The default value of the '{@link #getUtype() <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtype()
	 * @generated
	 * @ordered
	 */
	protected static final UnOperator UTYPE_EDEFAULT = UnOperator.NOT;

	/**
	 * The cached value of the '{@link #getUtype() <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtype()
	 * @generated
	 * @ordered
	 */
	protected UnOperator utype = UTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUformula() <em>Uformula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUformula()
	 * @generated
	 * @ordered
	 */
	protected Formula uformula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropdslPackage.Literals.UN_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOperator getUtype() {
		return utype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtype(UnOperator newUtype) {
		UnOperator oldUtype = utype;
		utype = newUtype == null ? UTYPE_EDEFAULT : newUtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropdslPackage.UN_OP__UTYPE, oldUtype, utype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getUformula() {
		if (uformula != null && uformula.eIsProxy()) {
			InternalEObject oldUformula = (InternalEObject) uformula;
			uformula = (Formula) eResolveProxy(oldUformula);
			if (uformula != oldUformula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropdslPackage.UN_OP__UFORMULA,
							oldUformula, uformula));
			}
		}
		return uformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula basicGetUformula() {
		return uformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUformula(Formula newUformula) {
		Formula oldUformula = uformula;
		uformula = newUformula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropdslPackage.UN_OP__UFORMULA, oldUformula,
					uformula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PropdslPackage.UN_OP__UTYPE:
			return getUtype();
		case PropdslPackage.UN_OP__UFORMULA:
			if (resolve)
				return getUformula();
			return basicGetUformula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PropdslPackage.UN_OP__UTYPE:
			setUtype((UnOperator) newValue);
			return;
		case PropdslPackage.UN_OP__UFORMULA:
			setUformula((Formula) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PropdslPackage.UN_OP__UTYPE:
			setUtype(UTYPE_EDEFAULT);
			return;
		case PropdslPackage.UN_OP__UFORMULA:
			setUformula((Formula) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PropdslPackage.UN_OP__UTYPE:
			return utype != UTYPE_EDEFAULT;
		case PropdslPackage.UN_OP__UFORMULA:
			return uformula != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (utype: ");
		result.append(utype);
		result.append(')');
		return result.toString();
	}

} //UnOpImpl
