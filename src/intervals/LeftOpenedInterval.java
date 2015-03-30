package intervals;

public class LeftOpenedInterval extends Interval {
	
	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
		this.opening = Opening.LEFT_OPENED; 
	}

	@Override
	public double midPoint() {
		return super.midPoint();
	}

	@Override
	public boolean includes(double value) {
		return value > this.minimum && value <= this.maximum;
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return false;
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

}
