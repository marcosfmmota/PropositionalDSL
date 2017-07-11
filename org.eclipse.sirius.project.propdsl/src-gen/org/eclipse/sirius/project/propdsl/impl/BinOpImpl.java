/**
 */
package org.eclipse.sirius.project.propdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.project.propdsl.BinOp;
import org.eclipse.sirius.project.propdsl.BinOperator;
import org.eclipse.sirius.project.propdsl.Formula;
import org.eclipse.sirius.project.propdsl.PropdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.project.propdsl.impl.BinOpImpl#getBtype <em>Btype</em>}</li>
 *   <li>{@link org.eclipse.sirius.project.propdsl.impl.BinOpImpl#getBformula <em>Bformula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinOpImpl extends FormulaImpl implements BinOp {
	/**
	 * The default value of the '{@link #getBtype() <em>Btype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtype()
	 * @generated
	 * @ordered
	 */
	protected static final BinOperator BTYPE_EDEFAULT = BinOperator.AND;

	/**
	 * The cached value of the '{@link #getBtype() <em>Btype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtype()
	 * @generated
	 * @ordered
	 */
	protected BinOperator btype = BTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBformula() <em>Bformula</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBformula()
	 * @generated
	 * @ordered
	 */
	protected EList<Formula> bformula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropdslPackage.Literals.BIN_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinOperator getBtype() {
		return btype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtype(BinOperator newBtype) {
		BinOperator oldBtype = btype;
		btype = newBtype == null ? BTYPE_EDEFAULT : newBtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropdslPackage.BIN_OP__BTYPE, oldBtype, btype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formula> getBformula() {
		if (bformula == null) {
			bformula = new EObjectResolvingEList<Formula>(Formula.class, this, PropdslPackage.BIN_OP__BFORMULA);
		}
		return bformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PropdslPackage.BIN_OP__BTYPE:
			return getBtype();
		case PropdslPackage.BIN_OP__BFORMULA:
			return getBformula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PropdslPackage.BIN_OP__BTYPE:
			setBtype((BinOperator) newValue);
			return;
		case PropdslPackage.BIN_OP__BFORMULA:
			getBformula().clear();
			getBformula().addAll((Collection<? extends Formula>) newValue);
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
		case PropdslPackage.BIN_OP__BTYPE:
			setBtype(BTYPE_EDEFAULT);
			return;
		case PropdslPackage.BIN_OP__BFORMULA:
			getBformula().clear();
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
		case PropdslPackage.BIN_OP__BTYPE:
			return btype != BTYPE_EDEFAULT;
		case PropdslPackage.BIN_OP__BFORMULA:
			return bformula != null && !bformula.isEmpty();
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
		result.append(" (btype: ");
		result.append(btype);
		result.append(')');
		return result.toString();
	}

} //BinOpImpl
