package intervals;

public abstract class Interval {

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
//		boolean included;
//		switch (this.opening) {
//			case BOTH_OPENED:
//				switch (interval.getOpening()) {
//					case BOTH_OPENED:
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//					case RIGHT_OPENED:
//						included = interval.getMinimum() > this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//					case LEFT_OPENED:
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() < this.maximum;
//						break;
//					default: //UNOPENED
//						included = interval.getMinimum() > this.minimum && interval.getMaximum() < this.maximum;
//						break;
//				}				
//				break;
//			case RIGHT_OPENED:
//				switch (interval.getOpening()) {
//					case BOTH_OPENED:
//					case RIGHT_OPENED:
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//					case LEFT_OPENED:						
//					default: //UNOPENED
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() < this.maximum;
//						break;
//				}
//				break;
//			case LEFT_OPENED:
//				switch (interval.getOpening()) {
//					case BOTH_OPENED:
//					case LEFT_OPENED:
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//					case RIGHT_OPENED:						
//					default: //UNOPENED
//						included = interval.getMinimum() > this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//				}
//				break;	
//			default: //UNOPENED
//				switch (interval.getOpening()) {
//					case BOTH_OPENED:						
//					case RIGHT_OPENED:						
//					case LEFT_OPENED:						
//					default: //UNOPENED
//						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
//						break;
//				}
//				break;
//		}
//		return included;
	

	public abstract boolean intersectsWith(Interval interval);

	public abstract Interval intersection(Interval interval);

//	@Override
//	public String toString() {
//		// TODO
//		return null;
//	}
//
//	@Override
//	public boolean equals(Object object) {
//		// TODO
//		return false;
//	}
}
