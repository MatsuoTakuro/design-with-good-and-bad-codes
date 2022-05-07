package Ch14.PurchasePointPayment;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Comic comic = new Comic();
        PurchasePointPayment purchasePointPayment = new PurchasePointPayment(customer, comic);

        System.out.println(customer);
        System.out.println(comic);
        System.out.println(purchasePointPayment);
    }
}
