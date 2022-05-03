package Ch5;

import Ch5.Discount.DiscountRate;
import Ch5.Discount.DiscountedPrice;
import Ch5.Discount.RegularPrice;
import Ch5.Equipment.Equipment;
import Ch5.Equipment.Equipments;
import Ch5.Game.Location;
import Ch5.Magic.MagicPoint;
import Ch5.Point.GiftPoint;
import Ch5.TaxCalculator.AmountExcludingTax;
import Ch5.TaxCalculator.AmountIncludingTax;

import static Ch5.TaxCalculator.TaxRate.taxRate;

public class Main {
    public static void main(String[] args) {
        point();
        taxCalculator();
        game();
        discount();
        magic();
        equipment();

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

    static void discount() {
        RegularPrice regPrice = new RegularPrice(1000);
        DiscountRate disRate = DiscountRate.newRegularDiscountRate();
        DiscountedPrice disPrice = DiscountedPrice.newDiscountedPrice(regPrice, disRate);
        System.out.println(disPrice.amount);
    }

    static void magic() {
        MagicPoint magPoint = MagicPoint.newMagicPoint();
        System.out.println(magPoint.currentAmount);
        magPoint.recover(120);
        System.out.println(magPoint.currentAmount);
        magPoint.consume(50);
        System.out.println(magPoint.currentAmount);
    }

    static void equipment() {
        Equipment armorX = Equipment.newArmor(100, 200);
//      Equipment headX = Equipment.newHead(100, 200);
        Equipments currentEquips = Equipments.newEquipments();
//      currentEquips.equipArmor(headX);
        currentEquips.equipArmor(armorX);
        currentEquips.deactivateAll();
    }
}
