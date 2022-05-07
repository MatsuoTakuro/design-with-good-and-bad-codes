package Ch8.Selling;

public class Main {
    public static void main(String[] args) {
        SellingPrice sellingPrice = new SellingPrice(500);
        System.out.println(sellingPrice);

        SellingCommission sellingCommission = new SellingCommission(sellingPrice);
        DeliveryCharge deliveryCharge = new DeliveryCharge(sellingPrice);
        ShoppingPoint shoppingPoint = new ShoppingPoint(sellingPrice);
        System.out.println(sellingCommission);
        System.out.println(deliveryCharge);
        System.out.println(shoppingPoint);

        TotalPrice totalPrice = new TotalPrice(sellingPrice, sellingCommission, deliveryCharge);
        System.out.println(totalPrice);
    }
}
