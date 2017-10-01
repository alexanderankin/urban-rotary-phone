package coinpal.prototype_instance.structures;

public class Address {
	private final char[] address;
	public Address() {
		throw new java.lang.UnsupportedOperationException();
	}
	
	public Address(String address) {
		this.address = new char[35];

		charifyAddress(address);
	}
	
	private void charifyAddress(String address) {
		int index = 0;
		for (; index < address.length(); index++) {
			this.address[index] = address.charAt(index);
		}
	}
	
	@Override
	public String toString() {
		return new String(address);
	}
}
