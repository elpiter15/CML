/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.VolumeLabel;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Volume Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VolumeLabelTest extends TestCase {

	/**
	 * The fixture for this Volume Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeLabel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VolumeLabelTest.class);
	}

	/**
	 * Constructs a new Volume Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Volume Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VolumeLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Volume Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeLabel getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createVolumeLabel());
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

} //VolumeLabelTest
