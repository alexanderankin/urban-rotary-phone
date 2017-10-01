package coinpal.prototype_instance.federated_system;

import org.junit.jupiter.api.Test;

import coinpal.prototype_instance.events.EventStream;
import coinpal.prototype_instance.events.Ping;
import coinpal.prototype_instance.events.Request;
import coinpal.prototype_instance.events.Response;

class ListenerTest {

	@Test
	void logsOnNewRequest() throws InterruptedException {
		EventStream<Request> requests = new EventStream<Request>();
		EventStream<Response> responses = new EventStream<Response>();
		FederatedSystem system = new FederatedSystem();
		Listener listener = new Listener(requests, responses, system);
		Thread thread = new Thread(listener);
		thread.start();
		requests.put(new Ping(0));
		Thread.currentThread().sleep(1000);
		thread.interrupt();
	}

}
