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
		return endpoint.getValue() < value && this.getValue() >= value;
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}

	public boolean lessThanOtherEndpoint(FromEndpoint fromEndpoint) {
		return fromEndpoint.getValue() < this.getValue();
	}

	public boolean lessThanOtherEndpoint(ToEndpoint toEndpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean lessThanOtherEndpoint(ExactEndpoint exactEndpoint) {
		return exactEndpoint.getValue() <= this.getValue();
	}

	@Override
	public boolean lessThanOtherEndpoint(Endpoint endpoint) {
		return endpoint.lessThanOtherEndpoint(this);
	}

	public boolean greaterThanOtherEndPoint(FromEndpoint fromEndpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean greaterThanOtherEndPoint(ToEndpoint toEndpoint) {
		return toEndpoint.getValue() > this.getValue();
	}

	public boolean greaterThanOtherEndPoint(ExactEndpoint exactEndpoint) {
		return exactEndpoint.getValue() >= this.getValue();
	}

	@Override
	public boolean greaterThanOtherEndPoint(Endpoint endpoint) {
		return endpoint.greaterThanOtherEndPoint(this);
	}

}
