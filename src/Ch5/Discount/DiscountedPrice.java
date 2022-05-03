package Ch5.Discount;

public class DiscountedPrice {
    private static final int MIN_PRICE = 0;
    public final int amount;

    private DiscountedPrice(final int amount) {
        if (amount < MIN_PRICE) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }

    public static DiscountedPrice newDiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        final double calculated = regularPrice.amount * (1.0 - discountRate.rate);
        final int amount = (int)Math.round(calculated);
        return new DiscountedPrice(amount);
    }
}
