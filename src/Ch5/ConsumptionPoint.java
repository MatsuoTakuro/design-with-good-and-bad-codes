package Ch5;

public class ConsumptionPoint {
    // Duplicated MIN_POINT...Should I make the superclass POINT?
    private static final int MIN_POINT = 0;
    final int value;

    private ConsumptionPoint(final int point) {
        if ( point < MIN_POINT) {
            throw new IllegalArgumentException("points are not more than 0.");
        }

        value = point;
    }
}
