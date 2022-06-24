/**
 */
package dockercompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.SecretConnector#getSecret <em>Secret</em>}</li>
 *   <li>{@link dockercompose.SecretConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link dockercompose.SecretConnector#getUid <em>Uid</em>}</li>
 *   <li>{@link dockercompose.SecretConnector#getGid <em>Gid</em>}</li>
 *   <li>{@link dockercompose.SecretConnector#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getSecretConnector()
 * @model
 * @generated
 */
public interface SecretConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' reference.
	 * @see #setSecret(Secret)
	 * @see dockercompose.DockercomposePackage#getSecretConnector_Secret()
	 * @model required="true"
	 * @generated
	 */
	Secret getSecret();

	/**
	 * Sets the value of the '{@link dockercompose.SecretConnector#getSecret <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' reference.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(Secret value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see dockercompose.DockercomposePackage#getSecretConnector_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link dockercompose.SecretConnector#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see dockercompose.DockercomposePackage#getSecretConnector_Uid()
	 * @model
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link dockercompose.SecretConnector#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see dockercompose.DockercomposePackage#getSecretConnector_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link dockercompose.SecretConnector#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(int)
	 * @see dockercompose.DockercomposePackage#getSecretConnector_Mode()
	 * @model required="true"
	 * @generated
	 */
	int getMode();

	/**
	 * Sets the value of the '{@link dockercompose.SecretConnector#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(int value);

} // SecretConnector
