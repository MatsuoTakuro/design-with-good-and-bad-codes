package Ch14.DeliveryCharge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.price;
        }
        return amount;
    }
}
