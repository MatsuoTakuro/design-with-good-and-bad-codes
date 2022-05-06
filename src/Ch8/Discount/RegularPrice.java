package Ch8.Discount;

public class RegularPrice {
    private static final int MIN_AMOUNT = 0;
    final int amount;

    RegularPrice(final int amount) {
        if (amount < MIN_AMOUNT) {
            throw new IllegalArgumentException("the price is not more than 0.");
        }
        this.amount = amount;
    }
}
