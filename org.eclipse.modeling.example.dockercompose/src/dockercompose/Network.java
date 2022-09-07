/**
 */
package dockercompose;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.Network#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.Network#isAttachable <em>Attachable</em>}</li>
 *   <li>{@link dockercompose.Network#isEnable_ipv6 <em>Enable ipv6</em>}</li>
 *   <li>{@link dockercompose.Network#isInternal <em>Internal</em>}</li>
 *   <li>{@link dockercompose.Network#isExternal <em>External</em>}</li>
 *   <li>{@link dockercompose.Network#getNetwork_name <em>Network name</em>}</li>
 *   <li>{@link dockercompose.Network#getLabels <em>Labels</em>}</li>
 *   <li>{@link dockercompose.Network#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link dockercompose.Network#getDriver <em>Driver</em>}</li>
 *   <li>{@link dockercompose.Network#getIpam <em>Ipam</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='different_driver_opts'"
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockercompose.DockercomposePackage#getNetwork_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockercompose.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachable</em>' attribute.
	 * @see #setAttachable(boolean)
	 * @see dockercompose.DockercomposePackage#getNetwork_Attachable()
	 * @model required="true"
	 * @generated
	 */
	boolean isAttachable();

	/**
	 * Sets the value of the '{@link dockercompose.Network#isAttachable <em>Attachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachable</em>' attribute.
	 * @see #isAttachable()
	 * @generated
	 */
	void setAttachable(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable ipv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable ipv6</em>' attribute.
	 * @see #setEnable_ipv6(boolean)
	 * @see dockercompose.DockercomposePackage#getNetwork_Enable_ipv6()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnable_ipv6();

	/**
	 * Sets the value of the '{@link dockercompose.Network#isEnable_ipv6 <em>Enable ipv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable ipv6</em>' attribute.
	 * @see #isEnable_ipv6()
	 * @generated
	 */
	void setEnable_ipv6(boolean value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see dockercompose.DockercomposePackage#getNetwork_Internal()
	 * @model required="true"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link dockercompose.Network#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see dockercompose.DockercomposePackage#getNetwork_External()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link dockercompose.Network#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Network name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network name</em>' attribute.
	 * @see #setNetwork_name(String)
	 * @see dockercompose.DockercomposePackage#getNetwork_Network_name()
	 * @model
	 * @generated
	 */
	String getNetwork_name();

	/**
	 * Sets the value of the '{@link dockercompose.Network#getNetwork_name <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network name</em>' attribute.
	 * @see #getNetwork_name()
	 * @generated
	 */
	void setNetwork_name(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.NetworkLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getNetwork_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Driver opts</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.NetworkDriverOpt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver opts</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getNetwork_Driver_opts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkDriverOpt> getDriver_opts();

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see dockercompose.DockercomposePackage#getNetwork_Driver()
	 * @model
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link dockercompose.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Ipam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipam</em>' containment reference.
	 * @see #setIpam(IPAM)
	 * @see dockercompose.DockercomposePackage#getNetwork_Ipam()
	 * @model containment="true"
	 * @generated
	 */
	IPAM getIpam();

	/**
	 * Sets the value of the '{@link dockercompose.Network#getIpam <em>Ipam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipam</em>' containment reference.
	 * @see #getIpam()
	 * @generated
	 */
	void setIpam(IPAM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.labels-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean different_labels(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.driver_opts-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean different_driver_opts(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Network
