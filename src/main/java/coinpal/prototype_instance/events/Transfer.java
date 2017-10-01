package coinpal.prototype_instance.events;

import coinpal.prototype_instance.federated_system.FederatedSystem;
import coinpal.prototype_instance.structures.Address;
import coinpal.prototype_instance.structures.ID;

public class Transfer implements Request {
	private final Address from;
	private final Address to;
	
	public Transfer() {
		throw new UnsupportedOperationException();
	}
	
	public Transfer(Address f, Address t) {
		from = f;
		to = t;
	}
	
	public Transfer(ID f, ID t) {
		from = f.getAddress();
		to = t.getAddress();
	}
	
	public Transfer(ID f, Address t) {
		from = f.getAddress();
		to = t;
	}
	
	public Address getFrom() {
		return from;
	}

	public Address getTo() {
		return to;
	}

	@Override
	public void visit(FederatedSystem f) {
		
	}
}
