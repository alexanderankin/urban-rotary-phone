package coinpal.prototype_instance.events.responses;

public class Pong extends Success {
	private final int id;
	private final boolean ok;

	public Pong() {
		throw new UnsupportedOperationException();
	}

	public Pong(int responseId) {
		ok = true;
		id = responseId;
	}

	public Pong(boolean o, int responseId) {
		ok = o;
		id = responseId;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public Type getType() {
		return Response.Type.SUCCESS;
	}

	@Override
	public boolean isOk() {
		return ok;
	}

}
