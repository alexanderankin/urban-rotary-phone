package coinpal.prototype_instance.structures;

public class ID {
	private final String username;
	private final Address address;

	public ID() {
		throw new UnsupportedOperationException();
	}
	
	public ID(String username, String address) {
		this.username = username;
		this.address = new Address(address);
	}
	
	public ID(String username, Address address) {
		this.username = username;
		this.address = address;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	@Override
	public String toString() {
		return username + ": " + address.toString();
	}
}
