/**
 */
package dockercompose.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dockercompose</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockercomposeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DockercomposeTests("dockercompose Tests");
		suite.addTestSuite(ServiceTest.class);
		suite.addTestSuite(ConfigTest.class);
		suite.addTestSuite(SecretTest.class);
		suite.addTestSuite(DNSTest.class);
		suite.addTestSuite(IPAMTest.class);
		suite.addTestSuite(NetworkAddressTest.class);
		suite.addTestSuite(IPAMConfigTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeTests(String name) {
		super(name);
	}

} //DockercomposeTests
