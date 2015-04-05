package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Endpoint minimumEndpoint, Endpoint maximumEndpoint) {
		super(minimumEndpoint, maximumEndpoint);
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
