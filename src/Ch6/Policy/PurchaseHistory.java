package Ch6.Policy;

public class PurchaseHistory {
    public int totalAmount;
    public int purchaseFrequencyPerMonth;
    public float returnRate;

    private PurchaseHistory(int totalAmount, int purchaseFrequencyPerMonth, float returnRate) {
        this.totalAmount = totalAmount;
        this.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth;
        this.returnRate = returnRate;
    }

    public static PurchaseHistory PotentialGoldCustomerHistory() {
        return new PurchaseHistory(100000, 10, 0);
    }

    public static PurchaseHistory PotentialSliverCustomerHistory() {
        return new PurchaseHistory(99999, 10, 0);
    }

    public static PurchaseHistory PotentialNormalCustomerHistory() {
        return new PurchaseHistory(99999, 9, 0);
    }
}
