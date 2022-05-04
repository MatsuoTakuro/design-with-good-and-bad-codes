package Ch6.Magic;

public class AttackPower {
    final int value;

    AttackPower(final int value) {
        if (value < 0) { throw new IllegalArgumentException("AttackPower is not positive."); }
        this.value = value;
    }
}
