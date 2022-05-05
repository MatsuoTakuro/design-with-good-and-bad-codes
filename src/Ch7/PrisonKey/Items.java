package Ch7.PrisonKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Items {
    final List<Item> items;

    private Items(final List<Item> items) {
        this.items = items;
    }

    public static Items withPrisonKey() {
        final Item prisonKey = Item.newPrisonKey();
        final List<Item> items = Arrays.asList(prisonKey);
        return new Items(items);
    }

    boolean hasPrisonKey() {
        return items.stream().anyMatch(item -> item.name.equals("prison key"));
    }
}
