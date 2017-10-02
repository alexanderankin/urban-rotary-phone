package coinpal.prototype_instance.events.requests;

import coinpal.prototype_instance.events.responses.Pong;
import coinpal.prototype_instance.events.responses.Response;
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
	public Response visit(FederatedSystem f) {
		return new Pong(id);
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
