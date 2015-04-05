package intervals;

public abstract class Endpoint {

	protected double value;

	protected Endpoint(double value) {
		this.value = value;
	}

	protected double getValue() {
		return value;
	}
	
	protected double midPoint(Endpoint endpoint){
		return (this.getValue() + endpoint.getValue()) / 2;
	}
	
	public abstract boolean includesValue(double value, FromEndpoint endpoint);
	
	public abstract boolean includesValue(double value, ToEndpoint endpoint);
	
	public abstract boolean includesValue(double value, ExactEndpoint endpoint);
	
	public abstract boolean includesValue(double value, Endpoint endpoint);
}
