package coinpal.prototype_instance.events.responses;

import java.math.BigInteger;

public class Balance extends Number {
	private final BigInteger balance;
	private final int responseId;
	
	public Balance() {
		throw new UnsupportedOperationException();
	}
	
	public Balance(BigInteger b, int requestId) {
		balance = b;
		responseId = requestId;
	}

	@Override
	public BigInteger getValue() {
		return balance;
	}

	@Override
	public int getId() {
		return responseId;
	}

}
