package intervals;

public class FromEndpoint extends Endpoint {

	public FromEndpoint(double value) {
		super(value);
	}

	public boolean includesValue(double value, ToEndpoint endpoint) {
		return this.getValue() < value && endpoint.getValue() > value;
	}

	public boolean includesValue(double value, ExactEndpoint endpoint) {
		return this.getValue() < value && endpoint.getValue() >= value;
	}

	public boolean includesValue(double value, FromEndpoint endpoint) {
		return false;
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}
}
