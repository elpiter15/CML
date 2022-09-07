/**
 */
package dockercompose.impl;

import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.Volume;
import dockercompose.VolumeDriverOpt;
import dockercompose.VolumeLabel;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.VolumeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeImpl#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeImpl#getVolume_name <em>Volume name</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeImpl#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends MinimalEObjectImpl.Container implements Volume {
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
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;

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
	 * The default value of the '{@link #getVolume_name() <em>Volume name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_name()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume_name() <em>Volume name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_name()
	 * @generated
	 * @ordered
	 */
	protected String volume_name = VOLUME_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDriver_opts() <em>Driver opts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_opts()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeDriverOpt> driver_opts;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeLabel> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.VOLUME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME__DRIVER, oldDriver, driver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolume_name() {
		return volume_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume_name(String newVolume_name) {
		String oldVolume_name = volume_name;
		volume_name = newVolume_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME__VOLUME_NAME, oldVolume_name, volume_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeDriverOpt> getDriver_opts() {
		if (driver_opts == null) {
			driver_opts = new EObjectContainmentEList<VolumeDriverOpt>(VolumeDriverOpt.class, this, DockercomposePackage.VOLUME__DRIVER_OPTS);
		}
		return driver_opts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<VolumeLabel>(VolumeLabel.class, this, DockercomposePackage.VOLUME__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_labels(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Volume::different_labels";
		try {
			/**
			 *
			 * inv different_labels:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.labels->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.VOLUME___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<VolumeLabel> labels = this.getLabels();
				final /*@NonInvalid*/ OrderedSetValue BOXED_labels = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_VolumeLabel, labels);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_VolumeLabel);
				Iterator<Object> ITERATOR__1 = BOXED_labels.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ VolumeLabel _1 = (VolumeLabel)ITERATOR__1.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
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
	public boolean different_driver_opts(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Volume::different_driver_opts";
		try {
			/**
			 *
			 * inv different_driver_opts:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.driver_opts->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.VOLUME___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<VolumeDriverOpt> driver_opts = this.getDriver_opts();
				final /*@NonInvalid*/ OrderedSetValue BOXED_driver_opts = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_VolumeDriverOpt, driver_opts);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_VolumeDriverOpt);
				Iterator<Object> ITERATOR__1 = BOXED_driver_opts.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ VolumeDriverOpt _1 = (VolumeDriverOpt)ITERATOR__1.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockercomposePackage.VOLUME__DRIVER_OPTS:
				return ((InternalEList<?>)getDriver_opts()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.VOLUME__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockercomposePackage.VOLUME__NAME:
				return getName();
			case DockercomposePackage.VOLUME__DRIVER:
				return getDriver();
			case DockercomposePackage.VOLUME__EXTERNAL:
				return isExternal();
			case DockercomposePackage.VOLUME__VOLUME_NAME:
				return getVolume_name();
			case DockercomposePackage.VOLUME__DRIVER_OPTS:
				return getDriver_opts();
			case DockercomposePackage.VOLUME__LABELS:
				return getLabels();
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
			case DockercomposePackage.VOLUME__NAME:
				setName((String)newValue);
				return;
			case DockercomposePackage.VOLUME__DRIVER:
				setDriver((String)newValue);
				return;
			case DockercomposePackage.VOLUME__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case DockercomposePackage.VOLUME__VOLUME_NAME:
				setVolume_name((String)newValue);
				return;
			case DockercomposePackage.VOLUME__DRIVER_OPTS:
				getDriver_opts().clear();
				getDriver_opts().addAll((Collection<? extends VolumeDriverOpt>)newValue);
				return;
			case DockercomposePackage.VOLUME__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends VolumeLabel>)newValue);
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
			case DockercomposePackage.VOLUME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME__VOLUME_NAME:
				setVolume_name(VOLUME_NAME_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME__DRIVER_OPTS:
				getDriver_opts().clear();
				return;
			case DockercomposePackage.VOLUME__LABELS:
				getLabels().clear();
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
			case DockercomposePackage.VOLUME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockercomposePackage.VOLUME__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case DockercomposePackage.VOLUME__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case DockercomposePackage.VOLUME__VOLUME_NAME:
				return VOLUME_NAME_EDEFAULT == null ? volume_name != null : !VOLUME_NAME_EDEFAULT.equals(volume_name);
			case DockercomposePackage.VOLUME__DRIVER_OPTS:
				return driver_opts != null && !driver_opts.isEmpty();
			case DockercomposePackage.VOLUME__LABELS:
				return labels != null && !labels.isEmpty();
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
			case DockercomposePackage.VOLUME___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP:
				return different_labels((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.VOLUME___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP:
				return different_driver_opts((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", driver: ");
		result.append(driver);
		result.append(", external: ");
		result.append(external);
		result.append(", volume_name: ");
		result.append(volume_name);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
