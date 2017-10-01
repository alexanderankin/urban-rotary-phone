package coinpal.prototype_instance.events;

import coinpal.prototype_instance.federated_system.FederatedSystem;

public class Ping implements Request {
	private final int id;

	public Ping() {
		throw new UnsupportedOperationException();
	}

	public Ping(int requestId) {
		id = requestId;
	}

	@Override
	public void visit(FederatedSystem f) {

	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ping request id (" + id + ")";
	}

}
