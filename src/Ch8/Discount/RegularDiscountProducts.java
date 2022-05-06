package Ch8.Discount;

import java.util.ArrayList;
import java.util.List;

public class RegularDiscountProducts {
    private final static int MAX_TOTAL_PRICE = 20000;
    final List<Product> discountProducts = new ArrayList<>();
    private int totalPrice;

    boolean add(Product product) {
        final RegularDiscountedPrice disPrice = new RegularDiscountedPrice(product.price);
        int tmp;
        if (product.canRegularDiscount) {
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
        return "Regular Discount Products: " + discountProducts.size() + ", totalPrice: " + totalPrice + "\n" +
                discountProducts;
    }
}
