package intervals;

public abstract class Endpoint {

	protected double value;

	protected Endpoint(double value) {
		this.value = value;
	}

	protected double getValue() {
		return value;
	}

	protected double midPoint(Endpoint endpoint) {
		return (this.getValue() + endpoint.getValue()) / 2;
	}

	public abstract boolean includesValue(double value, FromEndpoint fromEndpoint);

	public abstract boolean includesValue(double value, ToEndpoint toEndpoint);

	public abstract boolean includesValue(double value, ExactEndpoint exactEndpoint);

	public abstract boolean includesValue(double value, Endpoint endpoint);

	public abstract boolean lessThanOtherEndpoint(FromEndpoint fromEndpoint);

	public abstract boolean lessThanOtherEndpoint(ToEndpoint toEndpoint);

	public abstract boolean lessThanOtherEndpoint(ExactEndpoint exactEndpoint);

	public abstract boolean lessThanOtherEndpoint(Endpoint endpoint);

	public abstract boolean greaterThanOtherEndPoint(FromEndpoint fromEndpoint);

	public abstract boolean greaterThanOtherEndPoint(ToEndpoint toEndpoint);

	public abstract boolean greaterThanOtherEndPoint(ExactEndpoint exactEndpoint);

	public abstract boolean greaterThanOtherEndPoint(Endpoint endpoint);
}
