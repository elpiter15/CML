/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.IPAMAddress;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IPAM Address</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IPAMAddressTest extends TestCase {

	/**
	 * The fixture for this IPAM Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMAddress fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IPAMAddressTest.class);
	}

	/**
	 * Constructs a new IPAM Address test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPAMAddressTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IPAM Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IPAMAddress fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IPAM Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMAddress getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createIPAMAddress());
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

} //IPAMAddressTest
