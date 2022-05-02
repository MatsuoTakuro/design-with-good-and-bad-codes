package Ch4;

public class HitPoint {
    private static final int MIN = 0;
    private static final int INITIALIZED = 100;
    int amount;

    HitPoint(final int amount) {
        if (amount < MIN) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }

    HitPoint() {
        this.amount = INITIALIZED;
    }

    void damage(final int damagedAmount) {
        final int nextAmount = amount - damagedAmount;
        amount = Math.max(MIN, nextAmount);
    }

    boolean isZero() {
        return amount == MIN;
    }
}
