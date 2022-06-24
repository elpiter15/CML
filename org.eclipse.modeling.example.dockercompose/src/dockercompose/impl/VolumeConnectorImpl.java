/**
 */
package dockercompose.impl;

import dockercompose.AccessMode;
import dockercompose.DockercomposePackage;
import dockercompose.MountType;
import dockercompose.PropagationType;
import dockercompose.Volume;
import dockercompose.VolumeConnector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getContainer_path <em>Container path</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getAccess_mode <em>Access mode</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#isRead_only <em>Read only</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#isNocopy <em>Nocopy</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getSize <em>Size</em>}</li>
 *   <li>{@link dockercompose.impl.VolumeConnectorImpl#getPropagation <em>Propagation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeConnectorImpl extends MinimalEObjectImpl.Container implements VolumeConnector {
	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Volume volume;

	/**
	 * The default value of the '{@link #getContainer_path() <em>Container path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_path()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PATH_EDEFAULT = ".";

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
	 * The default value of the '{@link #getAccess_mode() <em>Access mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_mode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.RW;

	/**
	 * The cached value of the '{@link #getAccess_mode() <em>Access mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_mode()
	 * @generated
	 * @ordered
	 */
	protected AccessMode access_mode = ACCESS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MountType TYPE_EDEFAULT = MountType.VOLUME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MountType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected boolean read_only = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNocopy() <em>Nocopy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNocopy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOCOPY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNocopy() <em>Nocopy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNocopy()
	 * @generated
	 * @ordered
	 */
	protected boolean nocopy = NOCOPY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected static final PropagationType PROPAGATION_EDEFAULT = PropagationType.RPRIVATE;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected PropagationType propagation = PROPAGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.VOLUME_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume getVolume() {
		if (volume != null && volume.eIsProxy()) {
			InternalEObject oldVolume = (InternalEObject)volume;
			volume = (Volume)eResolveProxy(oldVolume);
			if (volume != oldVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockercomposePackage.VOLUME_CONNECTOR__VOLUME, oldVolume, volume));
			}
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(Volume newVolume) {
		Volume oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__VOLUME, oldVolume, volume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__CONTAINER_PATH, oldContainer_path, container_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessMode getAccess_mode() {
		return access_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess_mode(AccessMode newAccess_mode) {
		AccessMode oldAccess_mode = access_mode;
		access_mode = newAccess_mode == null ? ACCESS_MODE_EDEFAULT : newAccess_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__ACCESS_MODE, oldAccess_mode, access_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MountType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MountType newType) {
		MountType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRead_only() {
		return read_only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRead_only(boolean newRead_only) {
		boolean oldRead_only = read_only;
		read_only = newRead_only;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__READ_ONLY, oldRead_only, read_only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNocopy() {
		return nocopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNocopy(boolean newNocopy) {
		boolean oldNocopy = nocopy;
		nocopy = newNocopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__NOCOPY, oldNocopy, nocopy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropagationType getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropagation(PropagationType newPropagation) {
		PropagationType oldPropagation = propagation;
		propagation = newPropagation == null ? PROPAGATION_EDEFAULT : newPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.VOLUME_CONNECTOR__PROPAGATION, oldPropagation, propagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockercomposePackage.VOLUME_CONNECTOR__VOLUME:
				if (resolve) return getVolume();
				return basicGetVolume();
			case DockercomposePackage.VOLUME_CONNECTOR__CONTAINER_PATH:
				return getContainer_path();
			case DockercomposePackage.VOLUME_CONNECTOR__ACCESS_MODE:
				return getAccess_mode();
			case DockercomposePackage.VOLUME_CONNECTOR__TYPE:
				return getType();
			case DockercomposePackage.VOLUME_CONNECTOR__READ_ONLY:
				return isRead_only();
			case DockercomposePackage.VOLUME_CONNECTOR__NOCOPY:
				return isNocopy();
			case DockercomposePackage.VOLUME_CONNECTOR__SIZE:
				return getSize();
			case DockercomposePackage.VOLUME_CONNECTOR__PROPAGATION:
				return getPropagation();
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
			case DockercomposePackage.VOLUME_CONNECTOR__VOLUME:
				setVolume((Volume)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__CONTAINER_PATH:
				setContainer_path((String)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__ACCESS_MODE:
				setAccess_mode((AccessMode)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__TYPE:
				setType((MountType)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__READ_ONLY:
				setRead_only((Boolean)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__NOCOPY:
				setNocopy((Boolean)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__SIZE:
				setSize((Integer)newValue);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__PROPAGATION:
				setPropagation((PropagationType)newValue);
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
			case DockercomposePackage.VOLUME_CONNECTOR__VOLUME:
				setVolume((Volume)null);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__CONTAINER_PATH:
				setContainer_path(CONTAINER_PATH_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__ACCESS_MODE:
				setAccess_mode(ACCESS_MODE_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__READ_ONLY:
				setRead_only(READ_ONLY_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__NOCOPY:
				setNocopy(NOCOPY_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DockercomposePackage.VOLUME_CONNECTOR__PROPAGATION:
				setPropagation(PROPAGATION_EDEFAULT);
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
			case DockercomposePackage.VOLUME_CONNECTOR__VOLUME:
				return volume != null;
			case DockercomposePackage.VOLUME_CONNECTOR__CONTAINER_PATH:
				return CONTAINER_PATH_EDEFAULT == null ? container_path != null : !CONTAINER_PATH_EDEFAULT.equals(container_path);
			case DockercomposePackage.VOLUME_CONNECTOR__ACCESS_MODE:
				return access_mode != ACCESS_MODE_EDEFAULT;
			case DockercomposePackage.VOLUME_CONNECTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case DockercomposePackage.VOLUME_CONNECTOR__READ_ONLY:
				return read_only != READ_ONLY_EDEFAULT;
			case DockercomposePackage.VOLUME_CONNECTOR__NOCOPY:
				return nocopy != NOCOPY_EDEFAULT;
			case DockercomposePackage.VOLUME_CONNECTOR__SIZE:
				return size != SIZE_EDEFAULT;
			case DockercomposePackage.VOLUME_CONNECTOR__PROPAGATION:
				return propagation != PROPAGATION_EDEFAULT;
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
		result.append(" (container_path: ");
		result.append(container_path);
		result.append(", access_mode: ");
		result.append(access_mode);
		result.append(", type: ");
		result.append(type);
		result.append(", read_only: ");
		result.append(read_only);
		result.append(", nocopy: ");
		result.append(nocopy);
		result.append(", size: ");
		result.append(size);
		result.append(", propagation: ");
		result.append(propagation);
		result.append(')');
		return result.toString();
	}

} //VolumeConnectorImpl
