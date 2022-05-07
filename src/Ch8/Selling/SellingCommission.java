package Ch8.Selling;

public class SellingCommission {
    private static final float SELLING_COMMISSION_RATE = 0.05f;
    final int amount;

    SellingCommission(final SellingPrice sellingPrice) {
        amount = (int) (sellingPrice.amount * SELLING_COMMISSION_RATE);
    }

    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}
