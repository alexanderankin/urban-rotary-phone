package coinpal.prototype_instance.events;

import coinpal.prototype_instance.federated_system.FederatedSystem;

public class Balance implements Request {
	private final int id;

	public Balance() {
		throw new UnsupportedOperationException();
	}

	public Balance(int id) {
		this.id = id;
	}

	@Override
	public void visit(FederatedSystem f) {

	}

	@Override
	public int getId() {
		return id;
	}
}
