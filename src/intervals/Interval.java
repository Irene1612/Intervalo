package intervals;

public abstract class Interval {

	private static final String SEPARADOR = ", ";

	protected double minimum;
	protected double maximum;
	protected Opening opening;

	protected Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public Opening getOpening() {
		return opening;
	}

	public double midPoint() {
		return (this.minimum + this.maximum) / 2;
	}

	public abstract boolean includes(double value);

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
