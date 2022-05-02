package Ch5.Point;

public class GiftPoint {
    // Duplicated MIN_POINT...Should I make the superclass POINT?
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
    public final int value;

    private GiftPoint(final int point) {
        if ( point < MIN_POINT) {
            throw new IllegalArgumentException("points are not more than 0.");
        }

        value = point;
    }

    public static GiftPoint forStandardMembership() {
        return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
    }

    public static GiftPoint forPremiumMembership() {
        return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
    }

    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

    Boolean isEnough(final ConsumptionPoint consPoint) {
        return consPoint.value <= value;
    }

    GiftPoint consume(final ConsumptionPoint consPoint) {
        if (!isEnough(consPoint)) {
            throw new IllegalArgumentException("points are missing.");
        }
        return new GiftPoint(value - consPoint.value);
    }


}
