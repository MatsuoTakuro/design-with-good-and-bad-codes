package Ch6.Magic;

public class Main {
    public static void main(String[] args) {
        Member member = Member.newRandomMember();
        member.attack(MagicType.FIRE);
        member.attack(MagicType.SHIDEN);
        member.attack(MagicType.HELLFIRE);
    }
}
