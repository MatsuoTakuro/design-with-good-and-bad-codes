package Ch2;

public class HitPoint {
    private static final int MIN = 0;
    private static final int MAX = 999;
    final int value;

    HitPoint(final int value) {
        if (value < MIN) throw new IllegalArgumentException("Please input more than " + MIN);
        if (value > MAX) throw new IllegalArgumentException("Please input less than " + MAX);

    this.value = value;
    }

    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = damaged < MIN ? MIN : damaged;
        return new HitPoint(corrected);
    }

    HitPoint recover(final int recoveryAmount) {
        final int recovered = value + recoveryAmount;
        final int corrected = MAX < recovered ? MAX : recovered;
        return new HitPoint(corrected);
    }

}
