package coinpal.prototype_instance.structures;

import junit.framework.TestCase;

public class AddressTest extends TestCase {
	public void testAddress() {
		Address a = new Address("abc");
		System.out.println(a.toString());
	}
}
