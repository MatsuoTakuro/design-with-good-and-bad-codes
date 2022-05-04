package Ch6.Magic;

public class Shiden implements Magic {
    private final Member member;

    Shiden(final Member member) {
        this.member = member;
    }

    public String name() {
        return MagicType.SHIDEN.name();
    }

    public int costMagicPoint() {
        return 5 + (int)(member.level * 0.2);
    }
    
    public int attackPower() {
        return 50 + (int)(member.agility * 1.5);
    }

    public int costTechnicalPoint() {
        return 5;
    }
}
