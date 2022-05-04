package Ch6.Magic;

public class Shiden implements Magic {
    private final Member member;

    Shiden(final Member member) {
        this.member = member;
    }

    public String name() {
        return MagicType.SHIDEN.name();
    }

    public MagicPoint costMagicPoint() {
        final int value = 5 + (int)(member.level * 0.2);
        return new MagicPoint(value);
    }

    public AttackPower attackPower() {
        final int value = 50 + (int)(member.agility * 1.5);
        return new AttackPower(value);
    }

    public TechnicalPoint costTechnicalPoint() {
        final int value = 5;
        return new TechnicalPoint(value);
    }
}
