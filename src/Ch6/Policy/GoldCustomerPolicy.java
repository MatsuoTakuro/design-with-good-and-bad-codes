package Ch6.Policy;

import java.util.HashSet;
import java.util.Set;

public class GoldCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    GoldCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new GoldCustomerPurchaseAmountRule());
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
