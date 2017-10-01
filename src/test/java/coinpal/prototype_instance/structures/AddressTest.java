package coinpal.prototype_instance.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AddressTest {

	@Test
	void instantiateFromString() {
		String sample = "1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2";
		Address a = new Address(sample);
		assertEquals(sample, a.toString());
	}

	@Test
	void throwAddressWrongLength() {
		String tooShort = "abc";
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			new Address(tooShort);
		});
		assertEquals("Address is too short: " + tooShort, exception.getMessage());

		String tooLong = "abcdefghijklmnopqrstuvxyzabcdefghijkl";
		exception = assertThrows(IllegalArgumentException.class, () -> {
			new Address(tooLong);
		});
		assertEquals("Address is too long: " + tooLong, exception.getMessage());
	}

	@Test
	void throwNoAddress() {
		assertThrows(UnsupportedOperationException.class, () -> {
			new Address();
		});
	}
}
