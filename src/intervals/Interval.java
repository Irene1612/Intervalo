package intervals;

public class Interval {

	private double minimum;
	private double maximum;
	private Opening opening;

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public Opening getOpening() {
		return opening;
	}

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (this.minimum + this.maximum) / 2;
	}

	public boolean includes(double value) {
		return (value > this.minimum && value < this.maximum)
				|| (value == this.minimum && (this.opening == Opening.RIGHT_OPENED || this.opening == Opening.UNOPENED))
				|| (value == this.maximum && (this.opening == Opening.LEFT_OPENED || this.opening == Opening.UNOPENED));
	}

	public boolean includes(Interval interval) {
		boolean included;
		switch (this.opening) {
			case BOTH_OPENED:
				switch (interval.getOpening()) {
					case BOTH_OPENED:
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
						break;
					case RIGHT_OPENED:
						included = interval.getMinimum() > this.minimum && interval.getMaximum() <= this.maximum;
						break;
					case LEFT_OPENED:
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() < this.maximum;
						break;
					default: //UNOPENED
						included = interval.getMinimum() > this.minimum && interval.getMaximum() < this.maximum;
						break;
				}				
				break;
			case RIGHT_OPENED:
				switch (interval.getOpening()) {
					case BOTH_OPENED:
					case RIGHT_OPENED:
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
						break;
					case LEFT_OPENED:						
					default: //UNOPENED
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() < this.maximum;
						break;
				}
				//included = interval.getMinimum() >= this.minimum && interval.getMaximum() < this.maximum;
				break;
			case LEFT_OPENED:
				switch (interval.getOpening()) {
					case BOTH_OPENED:
					case LEFT_OPENED:
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
						break;
					case RIGHT_OPENED:						
					default: //UNOPENED
						included = interval.getMinimum() > this.minimum && interval.getMaximum() <= this.maximum;
						break;
				}
				break;	
			default: //UNOPENED
				switch (interval.getOpening()) {
					case BOTH_OPENED:						
					case RIGHT_OPENED:						
					case LEFT_OPENED:						
					default: //UNOPENED
						included = interval.getMinimum() >= this.minimum && interval.getMaximum() <= this.maximum;
						break;
				}
				break;
		}
		return included;
	}

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}
}
