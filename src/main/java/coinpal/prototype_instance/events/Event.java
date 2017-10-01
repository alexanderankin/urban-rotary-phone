package coinpal.prototype_instance.events;

import coinpal.prototype_instance.federated_system.FederatedSystem;

public interface Event {
	public void visit(FederatedSystem f);
}
