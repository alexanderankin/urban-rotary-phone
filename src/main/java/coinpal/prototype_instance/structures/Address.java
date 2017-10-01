package coinpal.prototype_instance.structures;

public class Address {
	public static final int MAX_LENGTH = 35;
	public static final int MIN_LENGTH = 26;
	private final char[] address;

	public Address() {
		throw new java.lang.UnsupportedOperationException();
	}

	public Address(String address) {
		int length = address.length();

		if (length >= MAX_LENGTH) {
			throw new IllegalArgumentException("Address is too long: " + address);
		}

		if (length <= MIN_LENGTH) {
			throw new IllegalArgumentException("Address is too short: " + address);
		}

		this.address = new char[length];
		System.arraycopy(address.toCharArray(), 0, this.address, 0, this.address.length);
	}

	@Override
	public String toString() {
		return new String(address);
	}
}
