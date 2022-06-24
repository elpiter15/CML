/**
 */
package dockercompose.impl;

import dockercompose.Alias;
import dockercompose.DNS;
import dockercompose.DockercomposePackage;
import dockercompose.Network;
import dockercompose.NetworkConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //NetworkConnectorImpl
