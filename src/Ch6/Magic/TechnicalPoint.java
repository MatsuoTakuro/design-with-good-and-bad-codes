package Ch6.Magic;

public class TechnicalPoint {
    final int value;

    TechnicalPoint(final int value) {
        if (value < 0) { throw new IllegalArgumentException("TechnicalPoint is not positive."); }
        this.value = value;
    }
}
