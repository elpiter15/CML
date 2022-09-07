/**
 */
package dockercompose.impl;

import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.IPAM;
import dockercompose.Network;
import dockercompose.NetworkDriverOpt;
import dockercompose.NetworkLabel;

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
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#isAttachable <em>Attachable</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#isEnable_ipv6 <em>Enable ipv6</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#isInternal <em>Internal</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#getNetwork_name <em>Network name</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkImpl#getIpam <em>Ipam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
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
	 * The default value of the '{@link #isAttachable() <em>Attachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttachable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTACHABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttachable() <em>Attachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttachable()
	 * @generated
	 * @ordered
	 */
	protected boolean attachable = ATTACHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnable_ipv6() <em>Enable ipv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_ipv6()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_IPV6_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnable_ipv6() <em>Enable ipv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_ipv6()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_ipv6 = ENABLE_IPV6_EDEFAULT;

	/**
	 * The default value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean internal = INTERNAL_EDEFAULT;

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
	 * The default value of the '{@link #getNetwork_name() <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_name() <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_name()
	 * @generated
	 * @ordered
	 */
	protected String network_name = NETWORK_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLabel> labels;

	/**
	 * The cached value of the '{@link #getDriver_opts() <em>Driver opts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_opts()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDriverOpt> driver_opts;

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
	 * The cached value of the '{@link #getIpam() <em>Ipam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpam()
	 * @generated
	 * @ordered
	 */
	protected IPAM ipam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAttachable() {
		return attachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachable(boolean newAttachable) {
		boolean oldAttachable = attachable;
		attachable = newAttachable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__ATTACHABLE, oldAttachable, attachable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnable_ipv6() {
		return enable_ipv6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnable_ipv6(boolean newEnable_ipv6) {
		boolean oldEnable_ipv6 = enable_ipv6;
		enable_ipv6 = newEnable_ipv6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__ENABLE_IPV6, oldEnable_ipv6, enable_ipv6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInternal() {
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternal(boolean newInternal) {
		boolean oldInternal = internal;
		internal = newInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__INTERNAL, oldInternal, internal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetwork_name() {
		return network_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork_name(String newNetwork_name) {
		String oldNetwork_name = network_name;
		network_name = newNetwork_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__NETWORK_NAME, oldNetwork_name, network_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<NetworkLabel>(NetworkLabel.class, this, DockercomposePackage.NETWORK__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkDriverOpt> getDriver_opts() {
		if (driver_opts == null) {
			driver_opts = new EObjectContainmentEList<NetworkDriverOpt>(NetworkDriverOpt.class, this, DockercomposePackage.NETWORK__DRIVER_OPTS);
		}
		return driver_opts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPAM getIpam() {
		return ipam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpam(IPAM newIpam, NotificationChain msgs) {
		IPAM oldIpam = ipam;
		ipam = newIpam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__IPAM, oldIpam, newIpam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpam(IPAM newIpam) {
		if (newIpam != ipam) {
			NotificationChain msgs = null;
			if (ipam != null)
				msgs = ((InternalEObject)ipam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.NETWORK__IPAM, null, msgs);
			if (newIpam != null)
				msgs = ((InternalEObject)newIpam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.NETWORK__IPAM, null, msgs);
			msgs = basicSetIpam(newIpam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__IPAM, newIpam, newIpam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_labels(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Network::different_labels";
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.NETWORK___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<NetworkLabel> labels = this.getLabels();
				final /*@NonInvalid*/ OrderedSetValue BOXED_labels = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_NetworkLabel, labels);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_NetworkLabel);
				Iterator<Object> ITERATOR__1 = BOXED_labels.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ NetworkLabel _1 = (NetworkLabel)ITERATOR__1.next();
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
		final String constraintName = "Network::different_driver_opts";
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.NETWORK___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<NetworkDriverOpt> driver_opts = this.getDriver_opts();
				final /*@NonInvalid*/ OrderedSetValue BOXED_driver_opts = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_NetworkDriverOpt, driver_opts);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_NetworkDriverOpt);
				Iterator<Object> ITERATOR__1 = BOXED_driver_opts.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ NetworkDriverOpt _1 = (NetworkDriverOpt)ITERATOR__1.next();
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
			case DockercomposePackage.NETWORK__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.NETWORK__DRIVER_OPTS:
				return ((InternalEList<?>)getDriver_opts()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.NETWORK__IPAM:
				return basicSetIpam(null, msgs);
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
			case DockercomposePackage.NETWORK__NAME:
				return getName();
			case DockercomposePackage.NETWORK__ATTACHABLE:
				return isAttachable();
			case DockercomposePackage.NETWORK__ENABLE_IPV6:
				return isEnable_ipv6();
			case DockercomposePackage.NETWORK__INTERNAL:
				return isInternal();
			case DockercomposePackage.NETWORK__EXTERNAL:
				return isExternal();
			case DockercomposePackage.NETWORK__NETWORK_NAME:
				return getNetwork_name();
			case DockercomposePackage.NETWORK__LABELS:
				return getLabels();
			case DockercomposePackage.NETWORK__DRIVER_OPTS:
				return getDriver_opts();
			case DockercomposePackage.NETWORK__DRIVER:
				return getDriver();
			case DockercomposePackage.NETWORK__IPAM:
				return getIpam();
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
			case DockercomposePackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case DockercomposePackage.NETWORK__ATTACHABLE:
				setAttachable((Boolean)newValue);
				return;
			case DockercomposePackage.NETWORK__ENABLE_IPV6:
				setEnable_ipv6((Boolean)newValue);
				return;
			case DockercomposePackage.NETWORK__INTERNAL:
				setInternal((Boolean)newValue);
				return;
			case DockercomposePackage.NETWORK__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case DockercomposePackage.NETWORK__NETWORK_NAME:
				setNetwork_name((String)newValue);
				return;
			case DockercomposePackage.NETWORK__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends NetworkLabel>)newValue);
				return;
			case DockercomposePackage.NETWORK__DRIVER_OPTS:
				getDriver_opts().clear();
				getDriver_opts().addAll((Collection<? extends NetworkDriverOpt>)newValue);
				return;
			case DockercomposePackage.NETWORK__DRIVER:
				setDriver((String)newValue);
				return;
			case DockercomposePackage.NETWORK__IPAM:
				setIpam((IPAM)newValue);
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
			case DockercomposePackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__ATTACHABLE:
				setAttachable(ATTACHABLE_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__ENABLE_IPV6:
				setEnable_ipv6(ENABLE_IPV6_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__INTERNAL:
				setInternal(INTERNAL_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__NETWORK_NAME:
				setNetwork_name(NETWORK_NAME_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__LABELS:
				getLabels().clear();
				return;
			case DockercomposePackage.NETWORK__DRIVER_OPTS:
				getDriver_opts().clear();
				return;
			case DockercomposePackage.NETWORK__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK__IPAM:
				setIpam((IPAM)null);
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
			case DockercomposePackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockercomposePackage.NETWORK__ATTACHABLE:
				return attachable != ATTACHABLE_EDEFAULT;
			case DockercomposePackage.NETWORK__ENABLE_IPV6:
				return enable_ipv6 != ENABLE_IPV6_EDEFAULT;
			case DockercomposePackage.NETWORK__INTERNAL:
				return internal != INTERNAL_EDEFAULT;
			case DockercomposePackage.NETWORK__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case DockercomposePackage.NETWORK__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? network_name != null : !NETWORK_NAME_EDEFAULT.equals(network_name);
			case DockercomposePackage.NETWORK__LABELS:
				return labels != null && !labels.isEmpty();
			case DockercomposePackage.NETWORK__DRIVER_OPTS:
				return driver_opts != null && !driver_opts.isEmpty();
			case DockercomposePackage.NETWORK__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case DockercomposePackage.NETWORK__IPAM:
				return ipam != null;
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
			case DockercomposePackage.NETWORK___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP:
				return different_labels((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.NETWORK___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP:
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
		result.append(", attachable: ");
		result.append(attachable);
		result.append(", enable_ipv6: ");
		result.append(enable_ipv6);
		result.append(", internal: ");
		result.append(internal);
		result.append(", external: ");
		result.append(external);
		result.append(", network_name: ");
		result.append(network_name);
		result.append(", driver: ");
		result.append(driver);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
