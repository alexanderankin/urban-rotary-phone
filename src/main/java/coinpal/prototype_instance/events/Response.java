package coinpal.prototype_instance.events;

public interface Response extends Event {

	/**
	 * This requires each response have a unique identifying number
	 * corresponding to the requests currently in service, to be updated with a
	 * state table somewhere in the server code.
	 * 
	 * @return the id of the response
	 */
	public int getId();

}
