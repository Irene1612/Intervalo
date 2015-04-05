package intervals;

public abstract class Interval {

	private static final String SEPARADOR = ", ";

	protected Endpoint minimumEndpoint;
	protected Endpoint maximumEndpoint;

	protected Interval(Endpoint minimumEndpoint, Endpoint maximumEndpoint) {
		this.minimumEndpoint = minimumEndpoint;
		this.maximumEndpoint = maximumEndpoint;
	}

	public Endpoint getMinimumEndpoint() {
		return minimumEndpoint;
	}

	public Endpoint getMaximumEndpoint() {
		return maximumEndpoint;
	}

	public double midPoint() {
		return minimumEndpoint.midPoint(maximumEndpoint);
	}

	public boolean includes(double value){
		return minimumEndpoint.includesValue(value, maximumEndpoint);
	}

	public boolean includes(Interval interval){
		return this.minimumEndpoint.lessThanOtherEndpoint(interval.getMinimumEndpoint()) && this.maximumEndpoint.greaterThanOtherEndPoint(interval.getMaximumEndpoint());
	}

	public abstract boolean intersectsWith(Interval interval);

	public abstract Interval intersection(Interval interval);

	@Override
	public String toString() {
		return this.minimumEndpoint.getValue() + Interval.SEPARADOR + this.maximumEndpoint.getValue();
	}
	
	protected boolean bothMinimunEquals(Interval interval){
		return this.minimumEndpoint.getValue() == interval.getMinimumEndpoint().getValue();
	}
	
	protected boolean bothMaximunEquals(Interval interval){
		return this.maximumEndpoint.getValue() == interval.getMaximumEndpoint().getValue();
	}
}
