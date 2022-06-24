/**
 */
package dockercompose;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.Secret#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.Secret#getFile <em>File</em>}</li>
 *   <li>{@link dockercompose.Secret#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link dockercompose.Secret#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.Secret#getSecret_name <em>Secret name</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getSecret()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='external_name'"
 * @generated
 */
public interface Secret extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockercompose.DockercomposePackage#getSecret_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockercompose.Secret#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see dockercompose.DockercomposePackage#getSecret_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link dockercompose.Secret#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see dockercompose.DockercomposePackage#getSecret_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link dockercompose.Secret#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see dockercompose.DockercomposePackage#getSecret_External()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link dockercompose.Secret#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Secret name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret name</em>' attribute.
	 * @see #setSecret_name(String)
	 * @see dockercompose.DockercomposePackage#getSecret_Secret_name()
	 * @model
	 * @generated
	 */
	String getSecret_name();

	/**
	 * Sets the value of the '{@link dockercompose.Secret#getSecret_name <em>Secret name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret name</em>' attribute.
	 * @see #getSecret_name()
	 * @generated
	 */
	void setSecret_name(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(file-&gt;excluding(\'\')-&gt;notEmpty() and external=false) or (file-&gt;excluding(\'\')-&gt;isEmpty() and external=true)'"
	 * @generated
	 */
	boolean file_or_external(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='secret_name-&gt;excluding(\'\')-&gt;notEmpty() implies external=true'"
	 * @generated
	 */
	boolean external_name(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Secret
