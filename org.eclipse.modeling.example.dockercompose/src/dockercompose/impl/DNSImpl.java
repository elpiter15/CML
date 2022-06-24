/**
 */
package dockercompose.impl;

import dockercompose.DNS;
import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.DNSImpl#getDns1 <em>Dns1</em>}</li>
 *   <li>{@link dockercompose.impl.DNSImpl#getDns2 <em>Dns2</em>}</li>
 *   <li>{@link dockercompose.impl.DNSImpl#getDns3 <em>Dns3</em>}</li>
 *   <li>{@link dockercompose.impl.DNSImpl#getDns4 <em>Dns4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DNSImpl extends MinimalEObjectImpl.Container implements DNS {
	/**
	 * The default value of the '{@link #getDns1() <em>Dns1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns1()
	 * @generated
	 * @ordered
	 */
	protected static final int DNS1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDns1() <em>Dns1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns1()
	 * @generated
	 * @ordered
	 */
	protected int dns1 = DNS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns2() <em>Dns2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns2()
	 * @generated
	 * @ordered
	 */
	protected static final int DNS2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDns2() <em>Dns2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns2()
	 * @generated
	 * @ordered
	 */
	protected int dns2 = DNS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns3() <em>Dns3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns3()
	 * @generated
	 * @ordered
	 */
	protected static final int DNS3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDns3() <em>Dns3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns3()
	 * @generated
	 * @ordered
	 */
	protected int dns3 = DNS3_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns4() <em>Dns4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns4()
	 * @generated
	 * @ordered
	 */
	protected static final int DNS4_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDns4() <em>Dns4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns4()
	 * @generated
	 * @ordered
	 */
	protected int dns4 = DNS4_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.DNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDns1() {
		return dns1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDns1(int newDns1) {
		int oldDns1 = dns1;
		dns1 = newDns1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DNS__DNS1, oldDns1, dns1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDns2() {
		return dns2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDns2(int newDns2) {
		int oldDns2 = dns2;
		dns2 = newDns2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DNS__DNS2, oldDns2, dns2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDns3() {
		return dns3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDns3(int newDns3) {
		int oldDns3 = dns3;
		dns3 = newDns3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DNS__DNS3, oldDns3, dns3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDns4() {
		return dns4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDns4(int newDns4) {
		int oldDns4 = dns4;
		dns4 = newDns4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DNS__DNS4, oldDns4, dns4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean correctIpFormat(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "DNS::correctIpFormat";
		try {
			/**
			 *
			 * inv correctIpFormat:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = dns1 >= 0 and dns2 >= 0 and dns3 >= 0 and dns4 >= 0 and dns1 <= 255 and dns2 <= 255 and dns3 <= 255 and dns4 <= 255
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.DNS___CORRECT_IP_FORMAT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ int dns4_0 = this.getDns4();
					final /*@NonInvalid*/ IntegerValue BOXED_dns4_0 = ValueUtil.integerValueOf(dns4_0);
					/*@Caught*/ Object CAUGHT_and_4;
					try {
						final /*@NonInvalid*/ int dns3_0 = this.getDns3();
						final /*@NonInvalid*/ IntegerValue BOXED_dns3_0 = ValueUtil.integerValueOf(dns3_0);
						/*@Caught*/ Object CAUGHT_and_3;
						try {
							final /*@NonInvalid*/ int dns2_0 = this.getDns2();
							final /*@NonInvalid*/ IntegerValue BOXED_dns2_0 = ValueUtil.integerValueOf(dns2_0);
							/*@Caught*/ Object CAUGHT_and_2;
							try {
								final /*@NonInvalid*/ int dns1_0 = this.getDns1();
								final /*@NonInvalid*/ IntegerValue BOXED_dns1_0 = ValueUtil.integerValueOf(dns1_0);
								/*@Caught*/ Object CAUGHT_and_1;
								try {
									/*@Caught*/ Object CAUGHT_and_0;
									try {
										final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns1_0, DockercomposeTables.INT_0).booleanValue();
										final /*@NonInvalid*/ Boolean and;
										if (!ge) {
											and = ValueUtil.FALSE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns2_0, DockercomposeTables.INT_0).booleanValue();
											if (!ge_0) {
												and = ValueUtil.FALSE_VALUE;
											}
											else {
												and = ValueUtil.TRUE_VALUE;
											}
										}
										final /*@Thrown*/ Boolean and_0;
										if (and == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean ge_1 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns3_0, DockercomposeTables.INT_0).booleanValue();
											if (!ge_1) {
												and_0 = ValueUtil.FALSE_VALUE;
											}
											else {
												if (and == null) {
													and_0 = null;
												}
												else {
													and_0 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_0 = and_0;
									}
									catch (Exception e) {
										CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_1;
									if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean ge_2 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns4_0, DockercomposeTables.INT_0).booleanValue();
										if (!ge_2) {
											and_1 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (CAUGHT_and_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and_0;
											}
											if (CAUGHT_and_0 == null) {
												and_1 = null;
											}
											else {
												and_1 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_1 = and_1;
								}
								catch (Exception e) {
									CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and_2;
								if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
									and_2 = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns1_0, DockercomposeTables.INT_255).booleanValue();
									if (!le_0) {
										and_2 = ValueUtil.FALSE_VALUE;
									}
									else {
										if (CAUGHT_and_1 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_and_1;
										}
										if (CAUGHT_and_1 == null) {
											and_2 = null;
										}
										else {
											and_2 = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and_2 = and_2;
							}
							catch (Exception e) {
								CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_3;
							if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
								and_3 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns2_0, DockercomposeTables.INT_255).booleanValue();
								if (!le_1) {
									and_3 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_2;
									}
									if (CAUGHT_and_2 == null) {
										and_3 = null;
									}
									else {
										and_3 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_3 = and_3;
						}
						catch (Exception e) {
							CAUGHT_and_3 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_4;
						if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
							and_4 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean le_2 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns3_0, DockercomposeTables.INT_255).booleanValue();
							if (!le_2) {
								and_4 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_and_3 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and_3;
								}
								if (CAUGHT_and_3 == null) {
									and_4 = null;
								}
								else {
									and_4 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_4 = and_4;
					}
					catch (Exception e) {
						CAUGHT_and_4 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_4 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean le_3 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_dns4_0, DockercomposeTables.INT_255).booleanValue();
						if (!le_3) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_4 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_4;
							}
							if (CAUGHT_and_4 == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockercomposePackage.DNS__DNS1:
				return getDns1();
			case DockercomposePackage.DNS__DNS2:
				return getDns2();
			case DockercomposePackage.DNS__DNS3:
				return getDns3();
			case DockercomposePackage.DNS__DNS4:
				return getDns4();
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
			case DockercomposePackage.DNS__DNS1:
				setDns1((Integer)newValue);
				return;
			case DockercomposePackage.DNS__DNS2:
				setDns2((Integer)newValue);
				return;
			case DockercomposePackage.DNS__DNS3:
				setDns3((Integer)newValue);
				return;
			case DockercomposePackage.DNS__DNS4:
				setDns4((Integer)newValue);
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
			case DockercomposePackage.DNS__DNS1:
				setDns1(DNS1_EDEFAULT);
				return;
			case DockercomposePackage.DNS__DNS2:
				setDns2(DNS2_EDEFAULT);
				return;
			case DockercomposePackage.DNS__DNS3:
				setDns3(DNS3_EDEFAULT);
				return;
			case DockercomposePackage.DNS__DNS4:
				setDns4(DNS4_EDEFAULT);
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
			case DockercomposePackage.DNS__DNS1:
				return dns1 != DNS1_EDEFAULT;
			case DockercomposePackage.DNS__DNS2:
				return dns2 != DNS2_EDEFAULT;
			case DockercomposePackage.DNS__DNS3:
				return dns3 != DNS3_EDEFAULT;
			case DockercomposePackage.DNS__DNS4:
				return dns4 != DNS4_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DockercomposePackage.DNS___CORRECT_IP_FORMAT__DIAGNOSTICCHAIN_MAP:
				return correctIpFormat((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dns1: ");
		result.append(dns1);
		result.append(", dns2: ");
		result.append(dns2);
		result.append(", dns3: ");
		result.append(dns3);
		result.append(", dns4: ");
		result.append(dns4);
		result.append(')');
		return result.toString();
	}

} //DNSImpl
