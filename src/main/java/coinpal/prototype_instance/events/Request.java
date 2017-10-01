package coinpal.prototype_instance.events;

public interface Request extends Event {
	/**
	 * This requires each request have a unique identifying number to all other
	 * requests currently in service, to be updated with a state table somewhere
	 * in the server code.
	 * 
	 * @return the id of the request
	 */
	public int getId();
}
