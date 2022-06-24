/**
 */
package dockercompose.tests;

import dockercompose.DNS;
import dockercompose.DockercomposeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link dockercompose.DNS#correctIpFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Ip Format</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DNSTest extends TestCase {

	/**
	 * The fixture for this DNS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNS fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DNSTest.class);
	}

	/**
	 * Constructs a new DNS test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNSTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this DNS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DNS fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this DNS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNS getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createDNS());
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
	 * Tests the '{@link dockercompose.DNS#correctIpFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Ip Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockercompose.DNS#correctIpFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testCorrectIpFormat__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DNSTest
