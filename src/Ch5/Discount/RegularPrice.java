package Ch5.Discount;

public class RegularPrice {
    private static final int MIN_PRICE = 0;
    final int amount;

    public RegularPrice(final int amount) {
        if (amount < MIN_PRICE) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }
}
