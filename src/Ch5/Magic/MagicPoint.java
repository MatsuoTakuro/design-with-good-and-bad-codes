package Ch5.Magic;

import java.util.ArrayList;
import java.util.List;

public class MagicPoint {
    final static int REG_ORIGINAL_MAX_AMOUNT = 100;
    private final int originalMaxAmount;
    public int currentAmount;
    private final List<Integer> maxIncrements;

    private MagicPoint(final int originalMaxAmount, final List<Integer> maxIncrements) {
        this.originalMaxAmount = originalMaxAmount;
        this.maxIncrements = maxIncrements;
    }

    public static MagicPoint newMagicPoint() {
        return new MagicPoint(REG_ORIGINAL_MAX_AMOUNT, new ArrayList<Integer>());
    }

    int max() {
        int amount = originalMaxAmount;
        for (int each: maxIncrements) {
            amount += each;
        }
        return amount;
    }

    public void recover(final int recoveredAmount) {
        currentAmount = Math.min(currentAmount + recoveredAmount, max());
    }

    public void consume(final int consumedAmount) {
        if (currentAmount < consumedAmount) {
            throw new IllegalArgumentException();
        }
        currentAmount -= consumedAmount;
    }
}
