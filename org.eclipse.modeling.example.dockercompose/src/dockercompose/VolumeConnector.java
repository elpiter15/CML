/**
 */
package dockercompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.VolumeConnector#getVolume <em>Volume</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#getContainer_path <em>Container path</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#getAccess_mode <em>Access mode</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#getType <em>Type</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#isRead_only <em>Read only</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#isNocopy <em>Nocopy</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#getSize <em>Size</em>}</li>
 *   <li>{@link dockercompose.VolumeConnector#getPropagation <em>Propagation</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getVolumeConnector()
 * @model
 * @generated
 */
public interface VolumeConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' reference.
	 * @see #setVolume(Volume)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Volume()
	 * @model required="true"
	 * @generated
	 */
	Volume getVolume();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getVolume <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Volume value);

	/**
	 * Returns the value of the '<em><b>Container path</b></em>' attribute.
	 * The default value is <code>"."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container path</em>' attribute.
	 * @see #setContainer_path(String)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Container_path()
	 * @model default="." required="true"
	 * @generated
	 */
	String getContainer_path();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getContainer_path <em>Container path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container path</em>' attribute.
	 * @see #getContainer_path()
	 * @generated
	 */
	void setContainer_path(String value);

	/**
	 * Returns the value of the '<em><b>Access mode</b></em>' attribute.
	 * The literals are from the enumeration {@link dockercompose.AccessMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access mode</em>' attribute.
	 * @see dockercompose.AccessMode
	 * @see #setAccess_mode(AccessMode)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Access_mode()
	 * @model
	 * @generated
	 */
	AccessMode getAccess_mode();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getAccess_mode <em>Access mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access mode</em>' attribute.
	 * @see dockercompose.AccessMode
	 * @see #getAccess_mode()
	 * @generated
	 */
	void setAccess_mode(AccessMode value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dockercompose.MountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dockercompose.MountType
	 * @see #setType(MountType)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Type()
	 * @model
	 * @generated
	 */
	MountType getType();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dockercompose.MountType
	 * @see #getType()
	 * @generated
	 */
	void setType(MountType value);

	/**
	 * Returns the value of the '<em><b>Read only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read only</em>' attribute.
	 * @see #setRead_only(boolean)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Read_only()
	 * @model required="true"
	 * @generated
	 */
	boolean isRead_only();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#isRead_only <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read only</em>' attribute.
	 * @see #isRead_only()
	 * @generated
	 */
	void setRead_only(boolean value);

	/**
	 * Returns the value of the '<em><b>Nocopy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nocopy</em>' attribute.
	 * @see #setNocopy(boolean)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Nocopy()
	 * @model required="true"
	 * @generated
	 */
	boolean isNocopy();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#isNocopy <em>Nocopy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nocopy</em>' attribute.
	 * @see #isNocopy()
	 * @generated
	 */
	void setNocopy(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Propagation</b></em>' attribute.
	 * The literals are from the enumeration {@link dockercompose.PropagationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation</em>' attribute.
	 * @see dockercompose.PropagationType
	 * @see #setPropagation(PropagationType)
	 * @see dockercompose.DockercomposePackage#getVolumeConnector_Propagation()
	 * @model
	 * @generated
	 */
	PropagationType getPropagation();

	/**
	 * Sets the value of the '{@link dockercompose.VolumeConnector#getPropagation <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation</em>' attribute.
	 * @see dockercompose.PropagationType
	 * @see #getPropagation()
	 * @generated
	 */
	void setPropagation(PropagationType value);

} // VolumeConnector
