/**
 */
package org.eclipse.sirius.project.propdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.project.propdsl.PropdslFactory
 * @model kind="package"
 * @generated
 */
public interface PropdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "propdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/project/propdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "propdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropdslPackage eINSTANCE = org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.impl.ExpressionImpl
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.impl.FormulaImpl
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.impl.PropositionImpl
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getProposition()
	 * @generated
	 */
	int PROPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__ROOT = FORMULA__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__NAME = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_OPERATION_COUNT = FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.impl.BinOpImpl <em>Bin Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.impl.BinOpImpl
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getBinOp()
	 * @generated
	 */
	int BIN_OP = 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__ROOT = FORMULA__ROOT;

	/**
	 * The feature id for the '<em><b>Btype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__BTYPE = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bformula</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__BFORMULA = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_OPERATION_COUNT = FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.impl.UnOpImpl <em>Un Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.impl.UnOpImpl
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getUnOp()
	 * @generated
	 */
	int UN_OP = 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP__ROOT = FORMULA__ROOT;

	/**
	 * The feature id for the '<em><b>Utype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP__UTYPE = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uformula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP__UFORMULA = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP_OPERATION_COUNT = FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.BinOperator <em>Bin Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.BinOperator
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getBinOperator()
	 * @generated
	 */
	int BIN_OPERATOR = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.project.propdsl.UnOperator <em>Un Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.project.propdsl.UnOperator
	 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getUnOperator()
	 * @generated
	 */
	int UN_OPERATOR = 6;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.project.propdsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.project.propdsl.Expression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Expression#getId()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.project.propdsl.Expression#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formula</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Expression#getFormula()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Formula();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.project.propdsl.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.project.propdsl.Formula#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Formula#getRoot()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.project.propdsl.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Proposition
	 * @generated
	 */
	EClass getProposition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.project.propdsl.Proposition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.project.propdsl.Proposition#getName()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.project.propdsl.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op</em>'.
	 * @see org.eclipse.sirius.project.propdsl.BinOp
	 * @generated
	 */
	EClass getBinOp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.project.propdsl.BinOp#getBtype <em>Btype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btype</em>'.
	 * @see org.eclipse.sirius.project.propdsl.BinOp#getBtype()
	 * @see #getBinOp()
	 * @generated
	 */
	EAttribute getBinOp_Btype();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.project.propdsl.BinOp#getBformula <em>Bformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bformula</em>'.
	 * @see org.eclipse.sirius.project.propdsl.BinOp#getBformula()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Bformula();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.project.propdsl.UnOp <em>Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Op</em>'.
	 * @see org.eclipse.sirius.project.propdsl.UnOp
	 * @generated
	 */
	EClass getUnOp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.project.propdsl.UnOp#getUtype <em>Utype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utype</em>'.
	 * @see org.eclipse.sirius.project.propdsl.UnOp#getUtype()
	 * @see #getUnOp()
	 * @generated
	 */
	EAttribute getUnOp_Utype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.project.propdsl.UnOp#getUformula <em>Uformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uformula</em>'.
	 * @see org.eclipse.sirius.project.propdsl.UnOp#getUformula()
	 * @see #getUnOp()
	 * @generated
	 */
	EReference getUnOp_Uformula();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.project.propdsl.BinOperator <em>Bin Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bin Operator</em>'.
	 * @see org.eclipse.sirius.project.propdsl.BinOperator
	 * @generated
	 */
	EEnum getBinOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.project.propdsl.UnOperator <em>Un Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Un Operator</em>'.
	 * @see org.eclipse.sirius.project.propdsl.UnOperator
	 * @generated
	 */
	EEnum getUnOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropdslFactory getPropdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.impl.ExpressionImpl
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__ID = eINSTANCE.getExpression_Id();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__FORMULA = eINSTANCE.getExpression_Formula();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.impl.FormulaImpl
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__ROOT = eINSTANCE.getFormula_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.impl.PropositionImpl
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getProposition()
		 * @generated
		 */
		EClass PROPOSITION = eINSTANCE.getProposition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__NAME = eINSTANCE.getProposition_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.impl.BinOpImpl <em>Bin Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.impl.BinOpImpl
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getBinOp()
		 * @generated
		 */
		EClass BIN_OP = eINSTANCE.getBinOp();

		/**
		 * The meta object literal for the '<em><b>Btype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN_OP__BTYPE = eINSTANCE.getBinOp_Btype();

		/**
		 * The meta object literal for the '<em><b>Bformula</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__BFORMULA = eINSTANCE.getBinOp_Bformula();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.impl.UnOpImpl <em>Un Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.impl.UnOpImpl
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getUnOp()
		 * @generated
		 */
		EClass UN_OP = eINSTANCE.getUnOp();

		/**
		 * The meta object literal for the '<em><b>Utype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_OP__UTYPE = eINSTANCE.getUnOp_Utype();

		/**
		 * The meta object literal for the '<em><b>Uformula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_OP__UFORMULA = eINSTANCE.getUnOp_Uformula();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.BinOperator <em>Bin Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.BinOperator
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getBinOperator()
		 * @generated
		 */
		EEnum BIN_OPERATOR = eINSTANCE.getBinOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.project.propdsl.UnOperator <em>Un Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.project.propdsl.UnOperator
		 * @see org.eclipse.sirius.project.propdsl.impl.PropdslPackageImpl#getUnOperator()
		 * @generated
		 */
		EEnum UN_OPERATOR = eINSTANCE.getUnOperator();

	}

} //PropdslPackage
