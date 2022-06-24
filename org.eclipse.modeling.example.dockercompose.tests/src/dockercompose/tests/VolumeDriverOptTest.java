/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.VolumeDriverOpt;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Volume Driver Opt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VolumeDriverOptTest extends TestCase {

	/**
	 * The fixture for this Volume Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeDriverOpt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VolumeDriverOptTest.class);
	}

	/**
	 * Constructs a new Volume Driver Opt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeDriverOptTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Volume Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VolumeDriverOpt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Volume Driver Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeDriverOpt getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createVolumeDriverOpt());
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

} //VolumeDriverOptTest
