package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
		this.opening = Opening.UNOPENED;
	}

	@Override
	public double midPoint() {
		return super.midPoint();
	}

	@Override
	public boolean includes(double value) {
		return value >= this.minimum && value <= this.maximum;
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimunLessThanOrEqual(interval) && this.maximunGreaterThanOrEqual(interval);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Interval intersection(Interval interval) {
		// TODO Auto-generated method stub
		return interval;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object object) {
		assert object instanceof UnopenedInterval;
		UnopenedInterval interval = (UnopenedInterval) object;
		return this.bothMinimunEquals(interval) && bothMaximunEquals(interval);
	}
}
