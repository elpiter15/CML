/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.Network;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link dockercompose.Network#different_labels(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Different labels</em>}</li>
 *   <li>{@link dockercompose.Network#different_driver_opts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Different driver opts</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NetworkTest extends TestCase {

	/**
	 * The fixture for this Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Network fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkTest.class);
	}

	/**
	 * Constructs a new Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Network fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Network getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DockercomposeFactory.eINSTANCE.createNetwork());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link dockercompose.Network#different_labels(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Different labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockercompose.Network#different_labels(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testDifferent_labels__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link dockercompose.Network#different_driver_opts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Different driver opts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockercompose.Network#different_driver_opts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testDifferent_driver_opts__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NetworkTest
