package Ch6.Magic;

public class HellFire implements Magic {
    private final Member member;

    HellFire(final Member member) {
        this.member = member;
    }

    public String name() {
        return MagicType.HELLFIRE.name();
    }

    public MagicPoint costMagicPoint() {
        final int value = 16;
        return new MagicPoint(value);
    }

    public AttackPower attackPower() {
        final int value = 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
        return new AttackPower(value);
    }

    public TechnicalPoint costTechnicalPoint() {
        final int value = 20 + (int)(member.level * 0.4);
        return new TechnicalPoint(value);
    }
}
