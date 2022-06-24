/**
 */
package dockercompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.NetworkAddress#getNetId <em>Net Id</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getNetworkAddress()
 * @model
 * @generated
 */
public interface NetworkAddress extends DNS {
	/**
	 * Returns the value of the '<em><b>Net Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Id</em>' attribute.
	 * @see #setNetId(int)
	 * @see dockercompose.DockercomposePackage#getNetworkAddress_NetId()
	 * @model required="true"
	 * @generated
	 */
	int getNetId();

	/**
	 * Sets the value of the '{@link dockercompose.NetworkAddress#getNetId <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Id</em>' attribute.
	 * @see #getNetId()
	 * @generated
	 */
	void setNetId(int value);

} // NetworkAddress
