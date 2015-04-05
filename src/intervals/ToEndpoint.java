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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}

	public boolean lessThanOtherEndpoint(FromEndpoint fromEndpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean lessThanOtherEndpoint(ToEndpoint toEndpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean lessThanOtherEndpoint(ExactEndpoint exactEndpoint) {
		// TODO Auto-generated method stub
		return false;
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
		return toEndpoint.getValue() >= this.getValue();
	}

	public boolean greaterThanOtherEndPoint(ExactEndpoint exactEndpoint) {
		return exactEndpoint.getValue() >= this.getValue();
	}

	@Override
	public boolean greaterThanOtherEndPoint(Endpoint endpoint) {
		return endpoint.greaterThanOtherEndPoint(this);
	}
}
