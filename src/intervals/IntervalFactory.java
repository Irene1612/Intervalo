package intervals;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		Interval interval;
		
		switch (opening) {
			case BOTH_OPENED:
				interval = new BothOpenedInterval(minimum, maximum);
				break;
			case RIGHT_OPENED:
				interval = new RightOpenedInterval(minimum, maximum);
				break;
			case LEFT_OPENED:
				interval = new LeftOpenedInterval(minimum, maximum);
				break;
			default: // UNOPENED
				interval = new UnopenedInterval(minimum, maximum);
				break;
		}
		return interval;
	}
}
