/**
 */
package dockercompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPAM Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.IPAMAddress#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.IPAMAddress#getDns <em>Dns</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getIPAMAddress()
 * @model
 * @generated
 */
public interface IPAMAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dockercompose.DockercomposePackage#getIPAMAddress_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dockercompose.IPAMAddress#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns</em>' containment reference.
	 * @see #setDns(DNS)
	 * @see dockercompose.DockercomposePackage#getIPAMAddress_Dns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DNS getDns();

	/**
	 * Sets the value of the '{@link dockercompose.IPAMAddress#getDns <em>Dns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns</em>' containment reference.
	 * @see #getDns()
	 * @generated
	 */
	void setDns(DNS value);

} // IPAMAddress
