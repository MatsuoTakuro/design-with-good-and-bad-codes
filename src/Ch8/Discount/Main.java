package Ch8.Discount;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("chair", 20000);
        Product p2 = new Product("table", 10000);

        RegularDiscountProducts regularDisProducts = new RegularDiscountProducts();
        regularDisProducts.add(p1);
        regularDisProducts.add(p2);
        System.out.println(regularDisProducts);

        SummerDiscountProducts summerDisProducts = new SummerDiscountProducts();
        summerDisProducts.add(p1);
        summerDisProducts.add(p2);
        System.out.println(summerDisProducts);
    }
}
