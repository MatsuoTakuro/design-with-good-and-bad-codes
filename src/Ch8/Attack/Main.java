package Ch8.Attack;

public class Main {
    public static void main(String[] args) {
        Member fighter = new Member();
        Member target = new Member();

        fighter.SingleFighterAttack(target);
        System.out.println(target.hitPoint);

        fighter.DoubleFighterAttack(target);
        System.out.println(target.hitPoint);
    }
}
