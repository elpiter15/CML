/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.NetworkDriverOpt;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Driver Opt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkDriverOptTest extends TestCase {

	/**
	 * The fixture for this Network Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkDriverOpt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkDriverOptTest.class);
	}

	/**
	 * Constructs a new Network Driver Opt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDriverOptTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Network Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NetworkDriverOpt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Network Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkDriverOpt getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createNetworkDriverOpt());
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

} //NetworkDriverOptTest
