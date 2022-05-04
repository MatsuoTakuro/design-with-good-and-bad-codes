package Ch6.Magic;

public class HitPoint {
    int value;

    HitPoint(final int value) {
        if (value < 0) { throw new IllegalArgumentException("HitPoint is not positive."); }
        this.value = value;
    }

    public HitPoint minus(AttackPower other) {
        final int deducted = minus(other.value);
        final int result = Math.max(0, deducted);
        return new HitPoint(result);
    }

    private int minus(int other) {
        return value - other;
    }

    public boolean isZero() {
        return value == 0;
    }
}
