package Ch5;

import Ch5.Game.Location;
import Ch5.Point.GiftPoint;
import Ch5.TaxCalculator.AmountExcludingTax;
import Ch5.TaxCalculator.AmountIncludingTax;

import static Ch5.TaxCalculator.TaxRate.taxRate;

public class Main {
    public static void main(String[] args) {
        point();
        taxCalculator();
        game();
    }

    static void point() {
        GiftPoint standardMembershipPoint = GiftPoint.forStandardMembership();
        GiftPoint premiumMembershipPoint = GiftPoint.forPremiumMembership();
        System.out.println(standardMembershipPoint.value);
        System.out.println(premiumMembershipPoint.value);
    }

    static void taxCalculator() {
        AmountExcludingTax exAmount = new AmountExcludingTax(500);
        AmountIncludingTax inAmount = new AmountIncludingTax(exAmount, taxRate());
        System.out.println(inAmount.value);
        Common.report("message tested");
    }

    static void game(){
        Location location = new Location(1, 2);
        Location shiftedLocation = location.shift(3, 4);
        System.out.println(shiftedLocation.x);
        System.out.println(shiftedLocation.y);
    }
}
