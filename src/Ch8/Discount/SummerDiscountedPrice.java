package Ch8.Discount;

public class SummerDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 300;
    final int amount;

    SummerDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        this.amount = discountedAmount;
    }
}
