package Ch5.Discount;

public class DiscountRate {
    final static double MIN_DISCOUNT_RATE = 0.0;
    final static double MAX_DISCOUNT_RATE = 1.0;
    final static double REGULAR_DISCOUNT_RATE = 0.1;
    final double rate;

    private DiscountRate(final double rate) {
        if (rate < MIN_DISCOUNT_RATE) {
            throw new IllegalArgumentException();
        }
        if (rate > MAX_DISCOUNT_RATE) {
            throw new IllegalArgumentException();
        }

        this.rate = rate;
    }

    static public DiscountRate newRegularDiscountRate() {
        return new DiscountRate(REGULAR_DISCOUNT_RATE);
    }
}
