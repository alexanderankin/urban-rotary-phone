package coinpal.prototype_instance.federated_system;

import java.math.BigInteger;

import coinpal.prototype_instance.structures.Address;
import coinpal.prototype_instance.structures.Table;

/**
 * This class represents the actual System, not the server or the instruments
 * that otherwise act on it.
 * 
 * TODO make serialize-able?
 */
public class FederatedSystem {

	private final Table table;

	public boolean isAwesome() {
		return true;
	}

	public FederatedSystem() {
		table = new Table();
	}

	public BigInteger getBalance(Address from) {
		BigInteger result = table.get(from);
		return null;
	}
}
