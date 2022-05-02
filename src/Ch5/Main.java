package Ch5;

public class Main {
    public static void main(String[] args) {
        GiftPoint standardMembershipPoint = GiftPoint.forStandardMembership();
        GiftPoint premiumMembershipPoint = GiftPoint.forPremiumMembership();
        System.out.println(standardMembershipPoint.value);
        System.out.println(premiumMembershipPoint.value);
    }
}
