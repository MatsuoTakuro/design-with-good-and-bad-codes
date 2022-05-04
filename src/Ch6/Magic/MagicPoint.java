package Ch6.Magic;

public class MagicPoint {
    int value;

    MagicPoint(final int value) {
        if (value < 0) { throw new IllegalArgumentException("MagicPoint is not positive."); }
        this.value = value;
    }
    
    public MagicPoint minus(MagicPoint other) {
        final int deducted = minus(other.value);
        final int result = Math.max(0, deducted);
        return new MagicPoint(result);
    }

    public boolean lessThan(int other) {
        return value < other;
    }
    
    private int minus(int other) {
        return value - other;
    }
}
