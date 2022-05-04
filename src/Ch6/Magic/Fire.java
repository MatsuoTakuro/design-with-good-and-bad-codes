package Ch6.Magic;

public class Fire implements Magic {
    private final Member member;

    Fire(final Member member) {
        this.member = member;
    }

    public String name() {
        return MagicType.FIRE.name();
    }

    public int costMagicPoint() {
        return 2;
    }

    public int attackPower() {
        return 20 + (int)(member.level * 0.5);
    }

    public int costTechnicalPoint() {
        return 0;
    }
}
