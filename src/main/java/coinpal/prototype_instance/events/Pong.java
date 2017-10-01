package coinpal.prototype_instance.events;

public class Pong implements Response {
	private final int id;
	
	public Pong() {
		throw new UnsupportedOperationException();
	}
	
	public Pong(int responseId) {
		id = responseId;
	}

	@Override
	public int getId() {
		return id;
	}

}
