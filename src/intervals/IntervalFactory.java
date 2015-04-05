package intervals;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		Interval interval;
		
		switch (opening) {
			case BOTH_OPENED:
				interval = new BothOpenedInterval(new FromEndpoint(minimum), new ToEndpoint(maximum));
				break;
			case RIGHT_OPENED:
				interval = new RightOpenedInterval(new ExactEndpoint(minimum), new ToEndpoint(maximum));
				break;
			case LEFT_OPENED:
				interval = new LeftOpenedInterval(new FromEndpoint(minimum), new ExactEndpoint(maximum));
				break;
			default: // UNOPENED
				interval = new UnopenedInterval(new ExactEndpoint(minimum), new ExactEndpoint(maximum));
				break;
		}
		return interval;
	}
}
