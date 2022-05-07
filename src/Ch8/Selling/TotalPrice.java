package Ch8.Selling;

public class TotalPrice {

    final int totalAmount;

    TotalPrice(final SellingPrice sellingPrice, final SellingCommission sellingCommission, final DeliveryCharge deliveryCharge) {
        totalAmount = sellingPrice.amount + sellingCommission.amount + deliveryCharge.amount;
    }

    @Override
    public String toString() {
        return String.valueOf(totalAmount);
    }
}
