package Ch14.DeliveryCharge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryChargeTest {

    @Test
    void payCharge() {
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "Product A", 500));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "Product B", 1499));
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        assertEquals(500, charge.amount);
    }

    @Test
    void chargeFree() {
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "Product A", 500));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "Product B", 1500));
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        assertEquals(0, charge.amount);
    }
}
