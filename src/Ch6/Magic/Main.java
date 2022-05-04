package Ch6.Magic;

public class Main {
    public static void main(String[] args) {
        Member member = Member.newRandomMember();
        Member opponent = Member.newRandomMember();
        member.attack(MagicType.FIRE, opponent);
        member.attack(MagicType.SHIDEN, opponent);
        member.attack(MagicType.HELLFIRE, opponent);
    }
}
