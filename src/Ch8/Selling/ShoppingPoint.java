package Ch8.Selling;

public class ShoppingPoint {
    private static final float SHOPPING_POINT_RATE = 0.01f;
    final int amount;

    ShoppingPoint(final SellingPrice sellingPrice) {
        amount = (int) (sellingPrice.amount * SHOPPING_POINT_RATE);
    }

    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}
