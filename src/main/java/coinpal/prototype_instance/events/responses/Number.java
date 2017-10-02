package coinpal.prototype_instance.events.responses;

import java.math.BigInteger;

public abstract class Number implements Response {
	public Type getType() {
		return Type.NUMBER;
	}
	
	public abstract BigInteger getValue();
}
