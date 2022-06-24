/**
 */
package dockercompose.tests;

import dockercompose.DockercomposeFactory;
import dockercompose.Secret;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link dockercompose.Secret#file_or_external(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>File or external</em>}</li>
 *   <li>{@link dockercompose.Secret#external_name(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>External name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SecretTest extends TestCase {

	/**
	 * The fixture for this Secret test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Secret fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecretTest.class);
	}

	/**
	 * Constructs a new Secret test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Secret test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Secret fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Secret test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Secret getFixture() {
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
		setFixture(DockercomposeFactory.eINSTANCE.createSecret());
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
	 * Tests the '{@link dockercompose.Secret#file_or_external(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>File or external</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockercompose.Secret#file_or_external(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testFile_or_external__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link dockercompose.Secret#external_name(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>External name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dockercompose.Secret#external_name(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testExternal_name__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SecretTest
