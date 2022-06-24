/**
 */
package dockercompose.impl;

import dockercompose.DNS;
import dockercompose.DockercomposePackage;
import dockercompose.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.PortImpl#getContainer_port <em>Container port</em>}</li>
 *   <li>{@link dockercompose.impl.PortImpl#getContainer_port_end <em>Container port end</em>}</li>
 *   <li>{@link dockercompose.impl.PortImpl#getHost_port <em>Host port</em>}</li>
 *   <li>{@link dockercompose.impl.PortImpl#getHost_port_end <em>Host port end</em>}</li>
 *   <li>{@link dockercompose.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link dockercompose.impl.PortImpl#getHost_ip <em>Host ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The default value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected int container_port = CONTAINER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer_port_end() <em>Container port end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port_end()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainer_port_end() <em>Container port end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port_end()
	 * @generated
	 * @ordered
	 */
	protected int container_port_end = CONTAINER_PORT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost_port() <em>Host port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHost_port() <em>Host port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port()
	 * @generated
	 * @ordered
	 */
	protected int host_port = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost_port_end() <em>Host port end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port_end()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHost_port_end() <em>Host port end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port_end()
	 * @generated
	 * @ordered
	 */
	protected int host_port_end = HOST_PORT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHost_ip() <em>Host ip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_ip()
	 * @generated
	 * @ordered
	 */
	protected DNS host_ip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContainer_port() {
		return container_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer_port(int newContainer_port) {
		int oldContainer_port = container_port;
		container_port = newContainer_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__CONTAINER_PORT, oldContainer_port, container_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContainer_port_end() {
		return container_port_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer_port_end(int newContainer_port_end) {
		int oldContainer_port_end = container_port_end;
		container_port_end = newContainer_port_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__CONTAINER_PORT_END, oldContainer_port_end, container_port_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHost_port() {
		return host_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost_port(int newHost_port) {
		int oldHost_port = host_port;
		host_port = newHost_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__HOST_PORT, oldHost_port, host_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHost_port_end() {
		return host_port_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost_port_end(int newHost_port_end) {
		int oldHost_port_end = host_port_end;
		host_port_end = newHost_port_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__HOST_PORT_END, oldHost_port_end, host_port_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNS getHost_ip() {
		return host_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost_ip(DNS newHost_ip, NotificationChain msgs) {
		DNS oldHost_ip = host_ip;
		host_ip = newHost_ip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__HOST_IP, oldHost_ip, newHost_ip);
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
	public void setHost_ip(DNS newHost_ip) {
		if (newHost_ip != host_ip) {
			NotificationChain msgs = null;
			if (host_ip != null)
				msgs = ((InternalEObject)host_ip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.PORT__HOST_IP, null, msgs);
			if (newHost_ip != null)
				msgs = ((InternalEObject)newHost_ip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockercomposePackage.PORT__HOST_IP, null, msgs);
			msgs = basicSetHost_ip(newHost_ip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.PORT__HOST_IP, newHost_ip, newHost_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockercomposePackage.PORT__HOST_IP:
				return basicSetHost_ip(null, msgs);
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
			case DockercomposePackage.PORT__CONTAINER_PORT:
				return getContainer_port();
			case DockercomposePackage.PORT__CONTAINER_PORT_END:
				return getContainer_port_end();
			case DockercomposePackage.PORT__HOST_PORT:
				return getHost_port();
			case DockercomposePackage.PORT__HOST_PORT_END:
				return getHost_port_end();
			case DockercomposePackage.PORT__PROTOCOL:
				return getProtocol();
			case DockercomposePackage.PORT__HOST_IP:
				return getHost_ip();
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
			case DockercomposePackage.PORT__CONTAINER_PORT:
				setContainer_port((Integer)newValue);
				return;
			case DockercomposePackage.PORT__CONTAINER_PORT_END:
				setContainer_port_end((Integer)newValue);
				return;
			case DockercomposePackage.PORT__HOST_PORT:
				setHost_port((Integer)newValue);
				return;
			case DockercomposePackage.PORT__HOST_PORT_END:
				setHost_port_end((Integer)newValue);
				return;
			case DockercomposePackage.PORT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case DockercomposePackage.PORT__HOST_IP:
				setHost_ip((DNS)newValue);
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
			case DockercomposePackage.PORT__CONTAINER_PORT:
				setContainer_port(CONTAINER_PORT_EDEFAULT);
				return;
			case DockercomposePackage.PORT__CONTAINER_PORT_END:
				setContainer_port_end(CONTAINER_PORT_END_EDEFAULT);
				return;
			case DockercomposePackage.PORT__HOST_PORT:
				setHost_port(HOST_PORT_EDEFAULT);
				return;
			case DockercomposePackage.PORT__HOST_PORT_END:
				setHost_port_end(HOST_PORT_END_EDEFAULT);
				return;
			case DockercomposePackage.PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case DockercomposePackage.PORT__HOST_IP:
				setHost_ip((DNS)null);
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
			case DockercomposePackage.PORT__CONTAINER_PORT:
				return container_port != CONTAINER_PORT_EDEFAULT;
			case DockercomposePackage.PORT__CONTAINER_PORT_END:
				return container_port_end != CONTAINER_PORT_END_EDEFAULT;
			case DockercomposePackage.PORT__HOST_PORT:
				return host_port != HOST_PORT_EDEFAULT;
			case DockercomposePackage.PORT__HOST_PORT_END:
				return host_port_end != HOST_PORT_END_EDEFAULT;
			case DockercomposePackage.PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case DockercomposePackage.PORT__HOST_IP:
				return host_ip != null;
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
		result.append(" (container_port: ");
		result.append(container_port);
		result.append(", container_port_end: ");
		result.append(container_port_end);
		result.append(", host_port: ");
		result.append(host_port);
		result.append(", host_port_end: ");
		result.append(host_port_end);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //PortImpl
