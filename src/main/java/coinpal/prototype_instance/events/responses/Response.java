package coinpal.prototype_instance.events.responses;

import coinpal.prototype_instance.events.Event;

public interface Response extends Event {
	/**
	 * These types correspond to subclasses of Response, as Response references
	 * are down cast to references with methods to retrieve the appropriate
	 * information.
	 *
	 */
	public static enum Type {
		SUCCESS, NUMBER, TRANSACTIONS
	}

	/**
	 * This requires each response have a unique identifying number
	 * corresponding to the requests currently in service, to be updated with a
	 * state table somewhere in the server code.
	 * 
	 * @return the id of the response
	 */
	public int getId();

	public Type getType();
}
