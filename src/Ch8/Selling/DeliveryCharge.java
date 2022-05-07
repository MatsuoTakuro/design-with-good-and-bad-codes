package Ch8.Selling;

public class DeliveryCharge {
    private static final float DELIVERY_FREE_MIN = 1000;
    final int amount;

    DeliveryCharge(final SellingPrice sellingPrice) {
        amount = (DELIVERY_FREE_MIN <= sellingPrice.amount) ? 0 : 500;
    }

    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}
