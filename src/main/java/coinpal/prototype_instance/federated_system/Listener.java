package coinpal.prototype_instance.federated_system;

import java.util.logging.Level;
import java.util.logging.Logger;

import coinpal.prototype_instance.events.RequestStream;
import coinpal.prototype_instance.events.ResponseStream;
import coinpal.prototype_instance.events.requests.Request;
import coinpal.prototype_instance.events.responses.Response;

public class Listener implements Runnable {
	private static Logger logger = Logger.getLogger(Listener.class.getName());
	private RequestStream input;
	private ResponseStream output;
	private FederatedSystem system;

	public Listener() {
		throw new UnsupportedOperationException();
	}

	public Listener(RequestStream i, ResponseStream o, FederatedSystem f) {
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

			logger.log(Level.INFO, "Processing Request " + next.toString());
			Response r = next.visit(system);
			output.add(r);
		}
	}
}
