package coinpal.prototype_instance.federated_system;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import coinpal.prototype_instance.events.RequestStream;
import coinpal.prototype_instance.events.ResponseStream;
import coinpal.prototype_instance.events.requests.Balance;
import coinpal.prototype_instance.events.requests.Ping;
import coinpal.prototype_instance.events.requests.Request;
import coinpal.prototype_instance.events.responses.Response;
import coinpal.prototype_instance.events.responses.Success;
import coinpal.prototype_instance.structures.ID;
import mockit.Mocked;
import mockit.Verifications;

@TestInstance(Lifecycle.PER_CLASS)
class ListenerComprehensiveTest {
	@Mocked
	Logger logger;

	RequestStream requests = new RequestStream();
	ResponseStream responses = new ResponseStream();
	FederatedSystem system = new FederatedSystem();
	Listener listener = new Listener(requests, responses, system);
	Thread thread = new Thread(listener);
	
	public ListenerComprehensiveTest() {
		thread.start();
	}

	@Test
	void balanceTest() {
		ID requestor = new ID("joeshmo", "awefawefawefawefawefawefawefawef");
		Request balance = new Balance(requestor, 0);
		requests.add(balance);
		
		try {
			Response r = responses.take();
			switch (r.getType()) {
			case NUMBER:
				assertTrue(false, "Got Numeric Response from invalid user");
				break;
			case SUCCESS:
				Success s = (Success) r;
				assertFalse(s.isOk(), "Failed to fail on invalid user");
				break;
			case TRANSACTIONS:
				break;
			default:
				break;
			}
		} catch (InterruptedException ignored) {
		}
	}

	@Test
	void logsOnNewRequest() {

		Request ping = new Ping(0);
		requests.add(ping); // FIXME use put

		try {
			Response r = responses.take();
			switch (r.getType()) {
			case SUCCESS:
				Success s = (Success) r;
				assertTrue(s.isOk());
				break;
			case NUMBER:
				assertEquals(true, false, "Expected Pong, got Number type");
				break;
			case TRANSACTIONS:
				assertEquals(true, false, "Expected Pong, got Transaction type");
				break;
			default:
				break;
			}
		} catch (InterruptedException ignored) {
		}

		new Verifications() {
			{
				logger.log(Level.INFO, "Processing Request " + ping.toString());
				times = 1;
			}
		};
	}

}
