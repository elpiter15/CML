/**
 */
package dockercompose.impl;

import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.Secret;

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

import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.SecretImpl#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.impl.SecretImpl#getFile <em>File</em>}</li>
 *   <li>{@link dockercompose.impl.SecretImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link dockercompose.impl.SecretImpl#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.impl.SecretImpl#getSecret_name <em>Secret name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretImpl extends MinimalEObjectImpl.Container implements Secret {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecret_name() <em>Secret name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecret_name() <em>Secret name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_name()
	 * @generated
	 * @ordered
	 */
	protected String secret_name = SECRET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.SECRET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SECRET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SECRET__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SECRET__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SECRET__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecret_name() {
		return secret_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecret_name(String newSecret_name) {
		String oldSecret_name = secret_name;
		secret_name = newSecret_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SECRET__SECRET_NAME, oldSecret_name, secret_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean file_or_external(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Secret::file_or_external";
		try {
			/**
			 *
			 * inv file_or_external:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = file->excluding('')
			 *         ->notEmpty() and external = false or
			 *         file->excluding('')
			 *         ->isEmpty() and external = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SECRET___FILE_OR_EXTERNAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_notEmpty;
						try {
							final /*@NonInvalid*/ String file = this.getFile();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, file);
							final /*@Thrown*/ SetValue excluding = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet, DockercomposeTables.STR_);
							final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(excluding).booleanValue();
							CAUGHT_notEmpty = notEmpty;
						}
						catch (Exception e) {
							CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_notEmpty == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean external = this.isExternal();
							final /*@NonInvalid*/ boolean eq = !external;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_notEmpty instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_notEmpty;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_isEmpty;
							try {
								final /*@NonInvalid*/ String file_0 = this.getFile();
								final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, file_0);
								final /*@Thrown*/ SetValue excluding_0 = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet_0, DockercomposeTables.STR_);
								final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(excluding_0).booleanValue();
								CAUGHT_isEmpty = isEmpty;
							}
							catch (Exception e) {
								CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_isEmpty == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean external_0 = this.isExternal();
								if (!external_0) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_isEmpty instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_isEmpty;
									}
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
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
	public boolean external_name(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Secret::external_name";
		try {
			/**
			 *
			 * inv external_name:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = secret_name->excluding('')
			 *         ->notEmpty() implies external = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SECRET___EXTERNAL_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_notEmpty;
					try {
						final /*@NonInvalid*/ String secret_name = this.getSecret_name();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, secret_name);
						final /*@Thrown*/ SetValue excluding = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet, DockercomposeTables.STR_);
						final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(excluding).booleanValue();
						CAUGHT_notEmpty = notEmpty;
					}
					catch (Exception e) {
						CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_notEmpty == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean external = this.isExternal();
						if (external) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_notEmpty instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_notEmpty;
							}
							result = ValueUtil.FALSE_VALUE;
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
			case DockercomposePackage.SECRET__NAME:
				return getName();
			case DockercomposePackage.SECRET__FILE:
				return getFile();
			case DockercomposePackage.SECRET__ENVIRONMENT:
				return getEnvironment();
			case DockercomposePackage.SECRET__EXTERNAL:
				return isExternal();
			case DockercomposePackage.SECRET__SECRET_NAME:
				return getSecret_name();
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
			case DockercomposePackage.SECRET__NAME:
				setName((String)newValue);
				return;
			case DockercomposePackage.SECRET__FILE:
				setFile((String)newValue);
				return;
			case DockercomposePackage.SECRET__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case DockercomposePackage.SECRET__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case DockercomposePackage.SECRET__SECRET_NAME:
				setSecret_name((String)newValue);
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
			case DockercomposePackage.SECRET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockercomposePackage.SECRET__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case DockercomposePackage.SECRET__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case DockercomposePackage.SECRET__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case DockercomposePackage.SECRET__SECRET_NAME:
				setSecret_name(SECRET_NAME_EDEFAULT);
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
			case DockercomposePackage.SECRET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockercomposePackage.SECRET__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case DockercomposePackage.SECRET__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case DockercomposePackage.SECRET__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case DockercomposePackage.SECRET__SECRET_NAME:
				return SECRET_NAME_EDEFAULT == null ? secret_name != null : !SECRET_NAME_EDEFAULT.equals(secret_name);
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
			case DockercomposePackage.SECRET___FILE_OR_EXTERNAL__DIAGNOSTICCHAIN_MAP:
				return file_or_external((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SECRET___EXTERNAL_NAME__DIAGNOSTICCHAIN_MAP:
				return external_name((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", file: ");
		result.append(file);
		result.append(", environment: ");
		result.append(environment);
		result.append(", external: ");
		result.append(external);
		result.append(", secret_name: ");
		result.append(secret_name);
		result.append(')');
		return result.toString();
	}

} //SecretImpl