package intervals;

public class ExactEndpoint extends Endpoint {

	public ExactEndpoint(double value) {
		super(value);
	}

	public boolean includesValue(double value, ExactEndpoint endpoint) {
		return endpoint.getValue() <= value && this.getValue() >= value;
	}

	public boolean includesValue(double value, ToEndpoint endpoint) {
		return this.getValue() <= value && endpoint.getValue() > value;
	}

	public boolean includesValue(double value, FromEndpoint endpoint) {
		return endpoint.getValue() < value && value <= this.getValue();
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}

}
