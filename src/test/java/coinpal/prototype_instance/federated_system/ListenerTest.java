package coinpal.prototype_instance.federated_system;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import coinpal.prototype_instance.events.EventStream;
import coinpal.prototype_instance.events.Ping;
import coinpal.prototype_instance.events.Request;
import coinpal.prototype_instance.events.Response;
import mockit.Mocked;
import mockit.Verifications;

class ListenerTest {

	@Mocked
	Logger logger;

	@Test
	void logsOnNewRequest() {
		EventStream<Request> requests = new EventStream<Request>();
		EventStream<Response> responses = new EventStream<Response>();
		FederatedSystem system = new FederatedSystem();
		Listener listener = new Listener(requests, responses, system);
		Thread thread = new Thread(listener);
		thread.start();
		Request ping = new Ping(0);
		requests.add(ping); // FIXME use put

		new Verifications() {
			{
				logger.log(Level.INFO, "Processing Request " + ping.toString());
				times = 1;
			}
		};
	}

}
