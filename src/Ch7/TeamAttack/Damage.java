package Ch7.TeamAttack;

public class Damage {
    final int amount;

    Damage(final int amount) {
        if (amount < 0) throw new IllegalArgumentException();
        this.amount = amount;
    }
}
