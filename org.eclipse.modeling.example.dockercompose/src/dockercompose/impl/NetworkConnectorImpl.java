/**
 */
package dockercompose.impl;

import dockercompose.Alias;
import dockercompose.DNS;
import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.Network;
import dockercompose.NetworkConnector;

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
 * An implementation of the model object '<em><b>Network Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.NetworkConnectorImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkConnectorImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkConnectorImpl#getIpv4_address <em>Ipv4 address</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkConnectorImpl#getLink_local_ips <em>Link local ips</em>}</li>
 *   <li>{@link dockercompose.impl.NetworkConnectorImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkConnectorImpl extends MinimalEObjectImpl.Container implements NetworkConnector {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIpv4_address() <em>Ipv4 address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4_address()
	 * @generated
	 * @ordered
	 */
	protected DNS ipv4_address;

	/**
	 * The cached value of the '{@link #getLink_local_ips() <em>Link local ips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_local_ips()
	 * @generated
	 * @ordered
	 */
	protected EList<DNS> link_local_ips;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<Alias> aliases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.NETWORK_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockercomposePackage.NETWORK_CONNECTOR__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK_CONNECTOR__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK_CONNECTOR__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNS getIpv4_address() {
		return ipv4_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpv4_address(DNS newIpv4_address, NotificationChain msgs) {
		DNS oldIpv4_address = ipv4_address;
		ipv4_address = newIpv4_address;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS, oldIpv4_address, newIpv4_address);
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
	public void setIpv4_address(DNS newIpv4_address) {
		if (newIpv4_address != ipv4_address) {
			NotificationChain msgs = null;
			if (ipv4_address != null)
				msgs = ((InternalEObject)ipv4_address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS, null, msgs);
			if (newIpv4_address != null)
				msgs = ((InternalEObject)newIpv4_address).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS, null, msgs);
			msgs = basicSetIpv4_address(newIpv4_address, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS, newIpv4_address, newIpv4_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNS> getLink_local_ips() {
		if (link_local_ips == null) {
			link_local_ips = new EObjectContainmentEList<DNS>(DNS.class, this, DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS);
		}
		return link_local_ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alias> getAliases() {
		if (aliases == null) {
			aliases = new EObjectContainmentEList<Alias>(Alias.class, this, DockercomposePackage.NETWORK_CONNECTOR__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_aliases(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "NetworkConnector::different_aliases";
		try {
			/**
			 *
			 * inv different_aliases:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.aliases->isUnique(alias)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.NETWORK_CONNECTOR___DIFFERENT_ALIASES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Alias> aliases = this.getAliases();
					final /*@NonInvalid*/ OrderedSetValue BOXED_aliases = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_Alias, aliases);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockercomposeTables.ORD_CLSSid_Alias);
					Iterator<Object> ITERATOR__1 = BOXED_aliases.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Alias _1 = (Alias)ITERATOR__1.next();
						/**
						 * alias
						 */
						final /*@NonInvalid*/ String alias = _1.getAlias();
						//
						if (accumulator.includes(alias) == ValueUtil.TRUE_VALUE) {
							result = false;
							break;			// Abort after second find
						}
						else {
							accumulator.add(alias);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS:
				return basicSetIpv4_address(null, msgs);
			case DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS:
				return ((InternalEList<?>)getLink_local_ips()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.NETWORK_CONNECTOR__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
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
			case DockercomposePackage.NETWORK_CONNECTOR__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case DockercomposePackage.NETWORK_CONNECTOR__PRIORITY:
				return getPriority();
			case DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS:
				return getIpv4_address();
			case DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS:
				return getLink_local_ips();
			case DockercomposePackage.NETWORK_CONNECTOR__ALIASES:
				return getAliases();
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
			case DockercomposePackage.NETWORK_CONNECTOR__NETWORK:
				setNetwork((Network)newValue);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS:
				setIpv4_address((DNS)newValue);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS:
				getLink_local_ips().clear();
				getLink_local_ips().addAll((Collection<? extends DNS>)newValue);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends Alias>)newValue);
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
			case DockercomposePackage.NETWORK_CONNECTOR__NETWORK:
				setNetwork((Network)null);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS:
				setIpv4_address((DNS)null);
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS:
				getLink_local_ips().clear();
				return;
			case DockercomposePackage.NETWORK_CONNECTOR__ALIASES:
				getAliases().clear();
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
			case DockercomposePackage.NETWORK_CONNECTOR__NETWORK:
				return network != null;
			case DockercomposePackage.NETWORK_CONNECTOR__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case DockercomposePackage.NETWORK_CONNECTOR__IPV4_ADDRESS:
				return ipv4_address != null;
			case DockercomposePackage.NETWORK_CONNECTOR__LINK_LOCAL_IPS:
				return link_local_ips != null && !link_local_ips.isEmpty();
			case DockercomposePackage.NETWORK_CONNECTOR__ALIASES:
				return aliases != null && !aliases.isEmpty();
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
			case DockercomposePackage.NETWORK_CONNECTOR___DIFFERENT_ALIASES__DIAGNOSTICCHAIN_MAP:
				return different_aliases((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //NetworkConnectorImpl
