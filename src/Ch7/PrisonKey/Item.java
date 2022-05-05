package Ch7.PrisonKey;

public class Item {
    Attribute name;

    private Item(Attribute name) {
        this.name = name;
    }

    public static Item newPrisonKey() {
        return new Item(Attribute.PRISON_KEY);
    }
}
