package coinpal.prototype_instance.events.requests;

import java.math.BigInteger;

import coinpal.prototype_instance.events.responses.Response;
import coinpal.prototype_instance.events.responses.Success;
import coinpal.prototype_instance.federated_system.FederatedSystem;
import coinpal.prototype_instance.structures.ID;

public class Balance implements Request {
	private final int id;
	private final ID from;

	public Balance() {
		throw new UnsupportedOperationException();
	}

	public Balance(ID f, int id) {
		from = f;
		this.id = id;
	}

	@Override
	public Response visit(FederatedSystem f) {
		BigInteger balance = f.getBalance(from);
		if (balance == null) {
			return new Success() {

				@Override
				public int getId() {
					return id;
				}

				@Override
				public boolean isOk() {
					return false;
				}
			};
		}
		return new coinpal.prototype_instance.events.responses.Balance(balance, id);
	}

	@Override
	public int getId() {
		return id;
	}
}
