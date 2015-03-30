package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
		this.opening = Opening.BOTH_OPENED;
	}

	@Override
	public double midPoint() {
		return super.midPoint();
	}

	@Override
	public boolean includes(double value) {
		return value > this.minimum && value < this.maximum;
	}

	@Override
	public boolean includes(Interval interval) {
		switch (interval.getOpening()) {
			case BOTH_OPENED:
				return this.minimunLessThanOrEqual(interval) && this.maximunGreaterThanOrEqual(interval);
			case RIGHT_OPENED:
				return this.minimunStrictlyLessThan(interval) && this.maximunGreaterThanOrEqual(interval);
			case LEFT_OPENED:
				return this.minimunLessThanOrEqual(interval) && this.maximunStrictlyGreaterThan(interval);
			default: // UNOPENED
				return this.minimunStrictlyLessThan(interval) && this.maximunStrictlyGreaterThan(interval);
		}
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
		return "(" + super.toString() + ")";
	}
	
	@Override
	public boolean equals(Object object) {
		assert object instanceof BothOpenedInterval;
		BothOpenedInterval interval = (BothOpenedInterval) object;
		return this.bothMinimunEquals(interval) && bothMaximunEquals(interval);
	}
}
