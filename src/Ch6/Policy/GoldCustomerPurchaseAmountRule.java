package Ch6.Policy;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 100000 <= history.totalAmount;
    }
}
