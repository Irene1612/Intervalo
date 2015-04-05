package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(Endpoint minimumEndpoint, Endpoint maximumEndpoint) {
		super(minimumEndpoint, maximumEndpoint);
	}

	@Override
	public double midPoint() {
		return super.midPoint();
	}

	@Override
	public boolean includes(Interval interval) {
		switch (interval.getOpening()) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return this.minimunLessThanOrEqual(interval) && this.maximunGreaterThanOrEqual(interval);
			default: // UNOPENED y RIGHT_OPENED
				return this.minimunStrictlyLessThan(interval) && this.maximunGreaterThanOrEqual(interval);
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
		return "(" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object object) {
		assert object instanceof LeftOpenedInterval;
		LeftOpenedInterval interval = (LeftOpenedInterval) object;
		return this.bothMinimunEquals(interval) && bothMaximunEquals(interval);
	}

}
