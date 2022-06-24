/**
 */
package dockercompose;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPAM Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.IPAMConfig#getGateway <em>Gateway</em>}</li>
 *   <li>{@link dockercompose.IPAMConfig#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link dockercompose.IPAMConfig#getIp_range <em>Ip range</em>}</li>
 *   <li>{@link dockercompose.IPAMConfig#getAux_addresses <em>Aux addresses</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getIPAMConfig()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='any_property'"
 * @generated
 */
public interface IPAMConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference.
	 * @see #setGateway(DNS)
	 * @see dockercompose.DockercomposePackage#getIPAMConfig_Gateway()
	 * @model containment="true"
	 * @generated
	 */
	DNS getGateway();

	/**
	 * Sets the value of the '{@link dockercompose.IPAMConfig#getGateway <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' containment reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(DNS value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' containment reference.
	 * @see #setSubnet(NetworkAddress)
	 * @see dockercompose.DockercomposePackage#getIPAMConfig_Subnet()
	 * @model containment="true"
	 * @generated
	 */
	NetworkAddress getSubnet();

	/**
	 * Sets the value of the '{@link dockercompose.IPAMConfig#getSubnet <em>Subnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' containment reference.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(NetworkAddress value);

	/**
	 * Returns the value of the '<em><b>Ip range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip range</em>' containment reference.
	 * @see #setIp_range(NetworkAddress)
	 * @see dockercompose.DockercomposePackage#getIPAMConfig_Ip_range()
	 * @model containment="true"
	 * @generated
	 */
	NetworkAddress getIp_range();

	/**
	 * Sets the value of the '{@link dockercompose.IPAMConfig#getIp_range <em>Ip range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip range</em>' containment reference.
	 * @see #getIp_range()
	 * @generated
	 */
	void setIp_range(NetworkAddress value);

	/**
	 * Returns the value of the '<em><b>Aux addresses</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.IPAMAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux addresses</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getIPAMConfig_Aux_addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPAMAddress> getAux_addresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(gateway-&gt;notEmpty()) or (subnet-&gt;size()&gt;0) or (ip_range-&gt;size()&gt;0) or (aux_addresses-&gt;size()&gt;0)'"
	 * @generated
	 */
	boolean any_property(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IPAMConfig
