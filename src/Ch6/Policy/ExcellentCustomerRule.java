package Ch6.Policy;

public interface ExcellentCustomerRule {

    boolean ok(final PurchaseHistory history);
}
