/**
 */
package dockercompose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.DockerCompose#getVersion <em>Version</em>}</li>
 *   <li>{@link dockercompose.DockerCompose#getServices <em>Services</em>}</li>
 *   <li>{@link dockercompose.DockerCompose#getNetworks <em>Networks</em>}</li>
 *   <li>{@link dockercompose.DockerCompose#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link dockercompose.DockerCompose#getConfigs <em>Configs</em>}</li>
 *   <li>{@link dockercompose.DockerCompose#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getDockerCompose()
 * @model
 * @generated
 */
public interface DockerCompose extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dockercompose.DockerCompose#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Config}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Configs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Config> getConfigs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getDockerCompose_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

} // DockerCompose
