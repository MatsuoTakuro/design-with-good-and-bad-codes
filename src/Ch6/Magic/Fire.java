package Ch6.Magic;

public class Fire implements Magic {
    private final Member member;

    Fire(final Member member) {
        this.member = member;
    }

    public String name() {
        return MagicType.FIRE.name();
    }

    public MagicPoint costMagicPoint() {
        final int value = 2;
        return new MagicPoint(value);
    }

    public AttackPower attackPower() {
        final int value = 20 + (int)(member.level * 0.5);
        return new AttackPower(value);
    }

    public TechnicalPoint costTechnicalPoint() {
        final int value = 0;
        return new TechnicalPoint(value);
    }
}
