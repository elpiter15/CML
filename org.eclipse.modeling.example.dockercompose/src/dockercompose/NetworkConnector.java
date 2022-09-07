/**
 */
package dockercompose;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.NetworkConnector#getNetwork <em>Network</em>}</li>
 *   <li>{@link dockercompose.NetworkConnector#getPriority <em>Priority</em>}</li>
 *   <li>{@link dockercompose.NetworkConnector#getIpv4_address <em>Ipv4 address</em>}</li>
 *   <li>{@link dockercompose.NetworkConnector#getLink_local_ips <em>Link local ips</em>}</li>
 *   <li>{@link dockercompose.NetworkConnector#getAliases <em>Aliases</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getNetworkConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='different_aliases'"
 * @generated
 */
public interface NetworkConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see dockercompose.DockercomposePackage#getNetworkConnector_Network()
	 * @model required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link dockercompose.NetworkConnector#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see dockercompose.DockercomposePackage#getNetworkConnector_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link dockercompose.NetworkConnector#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Ipv4 address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipv4 address</em>' containment reference.
	 * @see #setIpv4_address(DNS)
	 * @see dockercompose.DockercomposePackage#getNetworkConnector_Ipv4_address()
	 * @model containment="true"
	 * @generated
	 */
	DNS getIpv4_address();

	/**
	 * Sets the value of the '{@link dockercompose.NetworkConnector#getIpv4_address <em>Ipv4 address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv4 address</em>' containment reference.
	 * @see #getIpv4_address()
	 * @generated
	 */
	void setIpv4_address(DNS value);

	/**
	 * Returns the value of the '<em><b>Link local ips</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.DNS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link local ips</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getNetworkConnector_Link_local_ips()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNS> getLink_local_ips();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.Alias}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getNetworkConnector_Aliases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alias> getAliases();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.aliases-&gt;isUnique(alias)'"
	 * @generated
	 */
	boolean different_aliases(DiagnosticChain diagnostics, Map<Object, Object> context);

} // NetworkConnector
