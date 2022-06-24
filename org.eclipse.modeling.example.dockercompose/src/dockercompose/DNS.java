/**
 */
package dockercompose;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.DNS#getDns1 <em>Dns1</em>}</li>
 *   <li>{@link dockercompose.DNS#getDns2 <em>Dns2</em>}</li>
 *   <li>{@link dockercompose.DNS#getDns3 <em>Dns3</em>}</li>
 *   <li>{@link dockercompose.DNS#getDns4 <em>Dns4</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getDNS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctIpFormat'"
 * @generated
 */
public interface DNS extends EObject {
	/**
	 * Returns the value of the '<em><b>Dns1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns1</em>' attribute.
	 * @see #setDns1(int)
	 * @see dockercompose.DockercomposePackage#getDNS_Dns1()
	 * @model required="true"
	 * @generated
	 */
	int getDns1();

	/**
	 * Sets the value of the '{@link dockercompose.DNS#getDns1 <em>Dns1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns1</em>' attribute.
	 * @see #getDns1()
	 * @generated
	 */
	void setDns1(int value);

	/**
	 * Returns the value of the '<em><b>Dns2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns2</em>' attribute.
	 * @see #setDns2(int)
	 * @see dockercompose.DockercomposePackage#getDNS_Dns2()
	 * @model required="true"
	 * @generated
	 */
	int getDns2();

	/**
	 * Sets the value of the '{@link dockercompose.DNS#getDns2 <em>Dns2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns2</em>' attribute.
	 * @see #getDns2()
	 * @generated
	 */
	void setDns2(int value);

	/**
	 * Returns the value of the '<em><b>Dns3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns3</em>' attribute.
	 * @see #setDns3(int)
	 * @see dockercompose.DockercomposePackage#getDNS_Dns3()
	 * @model required="true"
	 * @generated
	 */
	int getDns3();

	/**
	 * Sets the value of the '{@link dockercompose.DNS#getDns3 <em>Dns3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns3</em>' attribute.
	 * @see #getDns3()
	 * @generated
	 */
	void setDns3(int value);

	/**
	 * Returns the value of the '<em><b>Dns4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns4</em>' attribute.
	 * @see #setDns4(int)
	 * @see dockercompose.DockercomposePackage#getDNS_Dns4()
	 * @model required="true"
	 * @generated
	 */
	int getDns4();

	/**
	 * Sets the value of the '{@link dockercompose.DNS#getDns4 <em>Dns4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns4</em>' attribute.
	 * @see #getDns4()
	 * @generated
	 */
	void setDns4(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='dns1&gt;=0 and dns2&gt;=0 and dns3&gt;=0 and dns4&gt;=0 and dns1&lt;=255 and dns2&lt;=255 and dns3&lt;=255 and dns4&lt;=255'"
	 * @generated
	 */
	boolean correctIpFormat(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DNS
