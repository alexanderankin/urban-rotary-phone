package coinpal.prototype_instance.federated_system;

import coinpal.prototype_instance.events.EventStream;
import coinpal.prototype_instance.events.Request;
import coinpal.prototype_instance.events.Response;

public class Listener implements Runnable {
	private EventStream<Request> input;
	private EventStream<Response> output;
	private FederatedSystem system;

	public Listener() {
		throw new UnsupportedOperationException();
	}

	public Listener(EventStream<Request> i, EventStream<Response> o, FederatedSystem f) {
		input = i;
		output = o;
		system = f;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Listener Thread");
		for (;;) {
			Request next = null;
			try {
				next = input.take();
			} catch (InterruptedException e) {
				return;
			}

			next.visit(system);
		}
	}
}
