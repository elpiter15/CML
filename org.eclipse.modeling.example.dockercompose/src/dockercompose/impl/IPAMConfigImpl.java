/**
 */
package dockercompose.impl;

import dockercompose.DNS;
import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.IPAMAddress;
import dockercompose.IPAMConfig;
import dockercompose.NetworkAddress;

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

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPAM Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.IPAMConfigImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link dockercompose.impl.IPAMConfigImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link dockercompose.impl.IPAMConfigImpl#getIp_range <em>Ip range</em>}</li>
 *   <li>{@link dockercompose.impl.IPAMConfigImpl#getAux_addresses <em>Aux addresses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPAMConfigImpl extends MinimalEObjectImpl.Container implements IPAMConfig {
	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected DNS gateway;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected NetworkAddress subnet;

	/**
	 * The cached value of the '{@link #getIp_range() <em>Ip range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_range()
	 * @generated
	 * @ordered
	 */
	protected NetworkAddress ip_range;

	/**
	 * The cached value of the '{@link #getAux_addresses() <em>Aux addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_addresses()
	 * @generated
	 * @ordered
	 */
	protected EList<IPAMAddress> aux_addresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.IPAM_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNS getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(DNS newGateway, NotificationChain msgs) {
		DNS oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__GATEWAY, oldGateway, newGateway);
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
	public void setGateway(DNS newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__GATEWAY, null, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__GATEWAY, null, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAddress getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubnet(NetworkAddress newSubnet, NotificationChain msgs) {
		NetworkAddress oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__SUBNET, oldSubnet, newSubnet);
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
	public void setSubnet(NetworkAddress newSubnet) {
		if (newSubnet != subnet) {
			NotificationChain msgs = null;
			if (subnet != null)
				msgs = ((InternalEObject)subnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__SUBNET, null, msgs);
			if (newSubnet != null)
				msgs = ((InternalEObject)newSubnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__SUBNET, null, msgs);
			msgs = basicSetSubnet(newSubnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__SUBNET, newSubnet, newSubnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAddress getIp_range() {
		return ip_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIp_range(NetworkAddress newIp_range, NotificationChain msgs) {
		NetworkAddress oldIp_range = ip_range;
		ip_range = newIp_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__IP_RANGE, oldIp_range, newIp_range);
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
	public void setIp_range(NetworkAddress newIp_range) {
		if (newIp_range != ip_range) {
			NotificationChain msgs = null;
			if (ip_range != null)
				msgs = ((InternalEObject)ip_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__IP_RANGE, null, msgs);
			if (newIp_range != null)
				msgs = ((InternalEObject)newIp_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.IPAM_CONFIG__IP_RANGE, null, msgs);
			msgs = basicSetIp_range(newIp_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.IPAM_CONFIG__IP_RANGE, newIp_range, newIp_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IPAMAddress> getAux_addresses() {
		if (aux_addresses == null) {
			aux_addresses = new EObjectContainmentEList<IPAMAddress>(IPAMAddress.class, this, DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES);
		}
		return aux_addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean any_property(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "IPAMConfig::any_property";
		try {
			/**
			 *
			 * inv any_property:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = gateway->notEmpty() or
			 *         subnet->size() > 0 or
			 *         ip_range->size() > 0 or
			 *         aux_addresses->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.IPAM_CONFIG___ANY_PROPERTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_or_0;
					try {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_notEmpty;
							try {
								final /*@NonInvalid*/ DNS gateway = this.getGateway();
								final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_CLSSid_DNS, gateway);
								final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
								CAUGHT_notEmpty = notEmpty;
							}
							catch (Exception e) {
								CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_notEmpty == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_gt;
								try {
									final /*@NonInvalid*/ NetworkAddress subnet = this.getSubnet();
									final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_CLSSid_NetworkAddress, subnet);
									final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet_0);
									final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, DockercomposeTables.INT_0).booleanValue();
									CAUGHT_gt = gt;
								}
								catch (Exception e) {
									CAUGHT_gt = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_notEmpty instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_notEmpty;
									}
									if (CAUGHT_gt instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_gt;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						}
						catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_0;
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_gt_0;
							try {
								final /*@NonInvalid*/ NetworkAddress ip_range = this.getIp_range();
								final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_CLSSid_NetworkAddress, ip_range);
								final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet_1);
								final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_0, DockercomposeTables.INT_0).booleanValue();
								CAUGHT_gt_0 = gt_0;
							}
							catch (Exception e) {
								CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt_0 == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or;
								}
								if (CAUGHT_gt_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_gt_0;
								}
								if (CAUGHT_or == null) {
									or_0 = null;
								}
								else {
									or_0 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_0 = or_0;
					}
					catch (Exception e) {
						CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<IPAMAddress> aux_addresses = this.getAux_addresses();
						final /*@NonInvalid*/ OrderedSetValue BOXED_aux_addresses = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_IPAMAddress, aux_addresses);
						final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_aux_addresses);
						final /*@NonInvalid*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_1, DockercomposeTables.INT_0).booleanValue();
						if (gt_1) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_0;
							}
							if (CAUGHT_or_0 == null) {
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
	public boolean different_addresses(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "IPAMConfig::different_addresses";
		try {
			/**
			 *
			 * inv different_addresses:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.aux_addresses->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.IPAM_CONFIG___DIFFERENT_ADDRESSES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<IPAMAddress> aux_addresses = this.getAux_addresses();
				final /*@NonInvalid*/ OrderedSetValue BOXED_aux_addresses = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_IPAMAddress, aux_addresses);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_IPAMAddress);
				Iterator<Object> ITERATOR__1 = BOXED_aux_addresses.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ IPAMAddress _1 = (IPAMAddress)ITERATOR__1.next();
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
			case DockercomposePackage.IPAM_CONFIG__GATEWAY:
				return basicSetGateway(null, msgs);
			case DockercomposePackage.IPAM_CONFIG__SUBNET:
				return basicSetSubnet(null, msgs);
			case DockercomposePackage.IPAM_CONFIG__IP_RANGE:
				return basicSetIp_range(null, msgs);
			case DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES:
				return ((InternalEList<?>)getAux_addresses()).basicRemove(otherEnd, msgs);
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
			case DockercomposePackage.IPAM_CONFIG__GATEWAY:
				return getGateway();
			case DockercomposePackage.IPAM_CONFIG__SUBNET:
				return getSubnet();
			case DockercomposePackage.IPAM_CONFIG__IP_RANGE:
				return getIp_range();
			case DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES:
				return getAux_addresses();
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
			case DockercomposePackage.IPAM_CONFIG__GATEWAY:
				setGateway((DNS)newValue);
				return;
			case DockercomposePackage.IPAM_CONFIG__SUBNET:
				setSubnet((NetworkAddress)newValue);
				return;
			case DockercomposePackage.IPAM_CONFIG__IP_RANGE:
				setIp_range((NetworkAddress)newValue);
				return;
			case DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES:
				getAux_addresses().clear();
				getAux_addresses().addAll((Collection<? extends IPAMAddress>)newValue);
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
			case DockercomposePackage.IPAM_CONFIG__GATEWAY:
				setGateway((DNS)null);
				return;
			case DockercomposePackage.IPAM_CONFIG__SUBNET:
				setSubnet((NetworkAddress)null);
				return;
			case DockercomposePackage.IPAM_CONFIG__IP_RANGE:
				setIp_range((NetworkAddress)null);
				return;
			case DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES:
				getAux_addresses().clear();
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
			case DockercomposePackage.IPAM_CONFIG__GATEWAY:
				return gateway != null;
			case DockercomposePackage.IPAM_CONFIG__SUBNET:
				return subnet != null;
			case DockercomposePackage.IPAM_CONFIG__IP_RANGE:
				return ip_range != null;
			case DockercomposePackage.IPAM_CONFIG__AUX_ADDRESSES:
				return aux_addresses != null && !aux_addresses.isEmpty();
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
			case DockercomposePackage.IPAM_CONFIG___ANY_PROPERTY__DIAGNOSTICCHAIN_MAP:
				return any_property((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.IPAM_CONFIG___DIFFERENT_ADDRESSES__DIAGNOSTICCHAIN_MAP:
				return different_addresses((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IPAMConfigImpl
