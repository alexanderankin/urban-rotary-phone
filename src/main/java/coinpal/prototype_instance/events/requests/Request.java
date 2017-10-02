package coinpal.prototype_instance.events.requests;

import coinpal.prototype_instance.events.Event;
import coinpal.prototype_instance.events.responses.Response;
import coinpal.prototype_instance.federated_system.FederatedSystem;

public interface Request extends Event {
	/**
	 * This requires each request have a unique identifying number to all other
	 * requests currently in service, to be updated with a state table somewhere
	 * in the server code.
	 * 
	 * @return the id of the request
	 */
	public int getId();
	
	public Response visit(FederatedSystem f);
}
