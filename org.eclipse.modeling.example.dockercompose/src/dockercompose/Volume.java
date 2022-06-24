/**
 */
package dockercompose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.Volume#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.Volume#getDriver <em>Driver</em>}</li>
 *   <li>{@link dockercompose.Volume#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.Volume#getVolume_name <em>Volume name</em>}</li>
 *   <li>{@link dockercompose.Volume#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link dockercompose.Volume#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockercompose.DockercomposePackage#getVolume_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockercompose.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see dockercompose.DockercomposePackage#getVolume_Driver()
	 * @model
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link dockercompose.Volume#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see dockercompose.DockercomposePackage#getVolume_External()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link dockercompose.Volume#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Volume name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume name</em>' attribute.
	 * @see #setVolume_name(String)
	 * @see dockercompose.DockercomposePackage#getVolume_Volume_name()
	 * @model
	 * @generated
	 */
	String getVolume_name();

	/**
	 * Sets the value of the '{@link dockercompose.Volume#getVolume_name <em>Volume name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume name</em>' attribute.
	 * @see #getVolume_name()
	 * @generated
	 */
	void setVolume_name(String value);

	/**
	 * Returns the value of the '<em><b>Driver opts</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.VolumeDriverOpt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver opts</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getVolume_Driver_opts()
	 * @model containment="true"
	 * @generated
	 */
	EList<VolumeDriverOpt> getDriver_opts();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.VolumeLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getVolume_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<VolumeLabel> getLabels();

} // Volume
