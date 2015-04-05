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

	public abstract boolean includes(Interval interval);

	protected boolean minimunLessThanOrEqual(Interval interval) {
		return interval.getMinimum() >= this.minimum;
	}

	protected boolean minimunStrictlyLessThan(Interval interval) {
		return interval.getMinimum() > this.minimum;
	}

	protected boolean maximunGreaterThanOrEqual(Interval interval) {
		return interval.getMaximum() <= this.maximum;
	}

	protected boolean maximunStrictlyGreaterThan(Interval interval) {
		return interval.getMaximum() < this.maximum;
	}

	public abstract boolean intersectsWith(Interval interval);

	public abstract Interval intersection(Interval interval);

	@Override
	public String toString() {
		return this.minimum + Interval.SEPARADOR + this.maximum;
	}
	
	protected boolean bothMinimunEquals(Interval interval){
		return this.minimum == interval.getMinimum();
	}
	
	protected boolean bothMaximunEquals(Interval interval){
		return this.maximum == interval.getMaximum();
	}
}
