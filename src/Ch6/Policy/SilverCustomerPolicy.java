package Ch6.Policy;

public class SilverCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    SilverCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }

    public ExcellentCustomerPolicy policy() {
        return policy;
    }
}
