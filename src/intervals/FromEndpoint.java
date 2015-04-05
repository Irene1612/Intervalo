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
		// TODO Auto-generated method stub
				return false;
	}

	@Override
	public boolean includesValue(double value, Endpoint endpoint) {
		return endpoint.includesValue(value, this);
	}

	public boolean lessThanOtherEndpoint(FromEndpoint fromEndpoint) {
		return fromEndpoint.getValue() <= this.getValue();
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
		// TODO Auto-generated method stub
		return false;
	}

	public boolean greaterThanOtherEndPoint(ExactEndpoint exactEndpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterThanOtherEndPoint(Endpoint endpoint) {
		return endpoint.greaterThanOtherEndPoint(this);
	}
}
