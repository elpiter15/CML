/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.IPAMOption;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IPAM Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IPAMOptionTest extends TestCase {

	/**
	 * The fixture for this IPAM Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMOption fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IPAMOptionTest.class);
	}

	/**
	 * Constructs a new IPAM Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPAMOptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IPAM Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IPAMOption fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IPAM Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMOption getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createIPAMOption());
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

} //IPAMOptionTest
