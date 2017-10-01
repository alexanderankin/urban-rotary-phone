package coinpal.prototype_instance;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FederatedSystemTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public FederatedSystemTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(FederatedSystemTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		FederatedSystem system = new FederatedSystem();
		assertTrue(system.isAwesome());
	}
}
