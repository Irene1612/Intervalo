package intervals;

public class ToEndpoint extends Endpoint {

	public ToEndpoint(double value) {
		super(value);
	}

	public boolean includesValue(double value, ExactEndpoint endpoint) {
		return endpoint.getValue() <= value && value < this.getValue();
	}

	public boolean includesValue(double value, FromEndpoint endpoint) {
		return endpoint.getValue() < value && value < this.getValue();
	}

	public boolean includesValue(double value, ToEndpoint endpoint) {
		return false;
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}
}
