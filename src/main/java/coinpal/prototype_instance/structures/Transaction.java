package coinpal.prototype_instance.structures;

public class Transaction {
	private Address from;
	private Address to;
	
	public Transaction() {
		throw new UnsupportedOperationException();
	}
	
	public Transaction(Address f, Address t) {
		from = f;
		to = t;
	}
	
	public Address getFrom() {
		return from;
	}
	
	public Address getTo() {
		return to;
	}
}
