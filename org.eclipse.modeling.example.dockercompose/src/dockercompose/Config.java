/**
 */
package dockercompose;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.Config#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.Config#getFile <em>File</em>}</li>
 *   <li>{@link dockercompose.Config#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.Config#getConfig_name <em>Config name</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getConfig()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='external_name'"
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockercompose.DockercomposePackage#getConfig_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockercompose.Config#getName <em>Name</em>}' attribute.
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
	 * @see dockercompose.DockercomposePackage#getConfig_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link dockercompose.Config#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see dockercompose.DockercomposePackage#getConfig_External()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link dockercompose.Config#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Config name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config name</em>' attribute.
	 * @see #setConfig_name(String)
	 * @see dockercompose.DockercomposePackage#getConfig_Config_name()
	 * @model
	 * @generated
	 */
	String getConfig_name();

	/**
	 * Sets the value of the '{@link dockercompose.Config#getConfig_name <em>Config name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config name</em>' attribute.
	 * @see #getConfig_name()
	 * @generated
	 */
	void setConfig_name(String value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='config_name-&gt;excluding(\'\')-&gt;notEmpty() implies external=true'"
	 * @generated
	 */
	boolean external_name(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Config
