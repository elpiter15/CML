/**
 */
package dockercompose.impl;

import dockercompose.Device;
import dockercompose.DockercomposePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.DeviceImpl#getHost_path <em>Host path</em>}</li>
 *   <li>{@link dockercompose.impl.DeviceImpl#getContainer_path <em>Container path</em>}</li>
 *   <li>{@link dockercompose.impl.DeviceImpl#getCgroup_permissions <em>Cgroup permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getHost_path() <em>Host path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_path()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost_path() <em>Host path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_path()
	 * @generated
	 * @ordered
	 */
	protected String host_path = HOST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer_path() <em>Container path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_path()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer_path() <em>Container path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_path()
	 * @generated
	 * @ordered
	 */
	protected String container_path = CONTAINER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCgroup_permissions() <em>Cgroup permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCgroup_permissions()
	 * @generated
	 * @ordered
	 */
	protected static final String CGROUP_PERMISSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCgroup_permissions() <em>Cgroup permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCgroup_permissions()
	 * @generated
	 * @ordered
	 */
	protected String cgroup_permissions = CGROUP_PERMISSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost_path() {
		return host_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost_path(String newHost_path) {
		String oldHost_path = host_path;
		host_path = newHost_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DEVICE__HOST_PATH, oldHost_path, host_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainer_path() {
		return container_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer_path(String newContainer_path) {
		String oldContainer_path = container_path;
		container_path = newContainer_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DEVICE__CONTAINER_PATH, oldContainer_path, container_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCgroup_permissions() {
		return cgroup_permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCgroup_permissions(String newCgroup_permissions) {
		String oldCgroup_permissions = cgroup_permissions;
		cgroup_permissions = newCgroup_permissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DEVICE__CGROUP_PERMISSIONS, oldCgroup_permissions, cgroup_permissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockercomposePackage.DEVICE__HOST_PATH:
				return getHost_path();
			case DockercomposePackage.DEVICE__CONTAINER_PATH:
				return getContainer_path();
			case DockercomposePackage.DEVICE__CGROUP_PERMISSIONS:
				return getCgroup_permissions();
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
			case DockercomposePackage.DEVICE__HOST_PATH:
				setHost_path((String)newValue);
				return;
			case DockercomposePackage.DEVICE__CONTAINER_PATH:
				setContainer_path((String)newValue);
				return;
			case DockercomposePackage.DEVICE__CGROUP_PERMISSIONS:
				setCgroup_permissions((String)newValue);
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
			case DockercomposePackage.DEVICE__HOST_PATH:
				setHost_path(HOST_PATH_EDEFAULT);
				return;
			case DockercomposePackage.DEVICE__CONTAINER_PATH:
				setContainer_path(CONTAINER_PATH_EDEFAULT);
				return;
			case DockercomposePackage.DEVICE__CGROUP_PERMISSIONS:
				setCgroup_permissions(CGROUP_PERMISSIONS_EDEFAULT);
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
			case DockercomposePackage.DEVICE__HOST_PATH:
				return HOST_PATH_EDEFAULT == null ? host_path != null : !HOST_PATH_EDEFAULT.equals(host_path);
			case DockercomposePackage.DEVICE__CONTAINER_PATH:
				return CONTAINER_PATH_EDEFAULT == null ? container_path != null : !CONTAINER_PATH_EDEFAULT.equals(container_path);
			case DockercomposePackage.DEVICE__CGROUP_PERMISSIONS:
				return CGROUP_PERMISSIONS_EDEFAULT == null ? cgroup_permissions != null : !CGROUP_PERMISSIONS_EDEFAULT.equals(cgroup_permissions);
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
		result.append(" (host_path: ");
		result.append(host_path);
		result.append(", container_path: ");
		result.append(container_path);
		result.append(", cgroup_permissions: ");
		result.append(cgroup_permissions);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
