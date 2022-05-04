package Ch6.Magic;

public class TechnicalPoint {
    int value;

    TechnicalPoint(final int value) {
        if (value < 0) { throw new IllegalArgumentException("TechnicalPoint is not positive."); }
        this.value = value;
    }

    public TechnicalPoint minus(TechnicalPoint other) {
        final int deducted = minus(other.value);
        final int result = Math.max(0, deducted);
        return new TechnicalPoint(result);
    }

    public boolean lessThan(int other) {
        return value < other;
    }

    private int minus(int other) {
        return value - other;
    }
}
