/**
 */
package dockercompose.impl;

import dockercompose.DockercomposePackage;
import dockercompose.Volume;
import dockercompose.VolumeDriverOpt;
import dockercompose.VolumeLabel;

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
