package Ch7.PrisonKey;

public class Item {
    String name;

    private Item(String name) {
        this.name = name;
    }

    public static Item newPrisonKey() {
        return new Item("prison key");
    }
}
