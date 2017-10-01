package coinpal.prototype_instance.events;

import coinpal.prototype_instance.federated_system.FederatedSystem;
import coinpal.prototype_instance.structures.Address;
import coinpal.prototype_instance.structures.ID;

public class Transfer implements Request {
	private final Address from;
	private final Address to;
	private final int id;

	public Transfer() {
		throw new UnsupportedOperationException();
	}

	public Transfer(Address f, Address t, int requestId) {
		from = f;
		to = t;
		id = requestId;
	}

	public Transfer(ID f, ID t, int requestId) {
		from = f.getAddress();
		to = t.getAddress();
		id = requestId;
	}

	public Transfer(ID f, Address t, int requestId) {
		from = f.getAddress();
		to = t;
		id = requestId;
	}

	public Address getFrom() {
		return from;
	}

	public Address getTo() {
		return to;
	}

	@Override
	public Response visit(FederatedSystem f) {
		return null;
	}

	@Override
	public int getId() {
		return id;
	}
}
