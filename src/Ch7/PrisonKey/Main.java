package Ch7.PrisonKey;

public class Main {
    public static void main(String[] args) {
        Items items = Items.withPrisonKey();
        System.out.println(items.hasPrisonKey());
    }
}
