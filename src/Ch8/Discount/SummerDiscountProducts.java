package Ch8.Discount;

import java.util.ArrayList;
import java.util.List;

public class SummerDiscountProducts {
    private final static int MAX_TOTAL_PRICE = 30000;
    final List<Product> discountProducts = new ArrayList<>();
    private int totalPrice;

    boolean add(Product product) {
        final SummerDiscountedPrice disPrice = new SummerDiscountedPrice(product.price);
        int tmp;
        if (product.canSummerDiscount) {
            tmp = totalPrice + disPrice.amount;
        } else {
            tmp = totalPrice + product.price();
        }

        if (tmp > MAX_TOTAL_PRICE) return false;

        totalPrice = tmp;
        discountProducts.add(product);
        return true;
    }

    @Override
    public String toString() {
        return "Summer Discount Products: " + discountProducts.size() + ", totalPrice: " + totalPrice + "\n" +
                discountProducts;
    }
}
