package Ch6.Policy;

public class Main {
    public static void main(String[] args) {
        PurchaseHistory gold = PurchaseHistory.PotentialGoldCustomerHistory();
        PurchaseHistory silver = PurchaseHistory.PotentialSliverCustomerHistory();
        PurchaseHistory normal = PurchaseHistory.PotentialNormalCustomerHistory();

        GoldCustomerPolicy goldPolicy = new GoldCustomerPolicy();
        SilverCustomerPolicy silverPolicy = new SilverCustomerPolicy();

        System.out.println(goldPolicy.complyWithAll(gold));
        System.out.println(goldPolicy.complyWithAll(silver));
        System.out.println(goldPolicy.complyWithAll(normal));

        System.out.println(silverPolicy.complyWithAll(gold));
        System.out.println(silverPolicy.complyWithAll(silver));
        System.out.println(silverPolicy.complyWithAll(normal));

    }
}
