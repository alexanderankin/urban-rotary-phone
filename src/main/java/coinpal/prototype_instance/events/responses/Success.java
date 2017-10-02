package coinpal.prototype_instance.events.responses;

public abstract class Success implements Response {
	public Type getType() {
		return Type.SUCCESS;
	}

	public abstract boolean isOk();
}
