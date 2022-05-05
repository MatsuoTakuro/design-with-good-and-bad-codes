package Ch6.Damage;

public class Main {
    public static void main(String[] args) {
        Member member = Member.newMember(100, 100);
        member.applyDamage(DamageType.hitPoint, 50);
        member.applyDamage(DamageType.magicPoint, 50);
        System.out.println(member.hitPoint);
        System.out.println(member.magicPoint);
        System.out.println(member.states);
        member.applyDamage(DamageType.hitPoint, 50);
        System.out.println(member.hitPoint);
        System.out.println(member.states);
    }
}
