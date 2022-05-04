package Ch6.Magic;

public class MagicPoint {
    final int value;

    MagicPoint(final int value) {
        if (value < 0) { throw new IllegalArgumentException("MagicPoint is not positive."); }
        this.value = value;
    }
}
