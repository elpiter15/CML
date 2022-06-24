/**
 */
package dockercompose;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.IPAM#getDriver <em>Driver</em>}</li>
 *   <li>{@link dockercompose.IPAM#getOptions <em>Options</em>}</li>
 *   <li>{@link dockercompose.IPAM#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @see dockercompose.DockercomposePackage#getIPAM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='any_property'"
 * @generated
 */
public interface IPAM extends EObject {
	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see dockercompose.DockercomposePackage#getIPAM_Driver()
	 * @model
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link dockercompose.IPAM#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.IPAMOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getIPAM_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPAMOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link dockercompose.IPAMConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see dockercompose.DockercomposePackage#getIPAM_Configs()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPAMConfig> getConfigs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(driver-&gt;excluding(\'\')-&gt;notEmpty()) or (options-&gt;size()&gt;0) or (configs-&gt;size()&gt;0)'"
	 * @generated
	 */
	boolean any_property(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IPAM
