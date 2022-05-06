package Ch8.Attack;

public class Member {
    int hitPoint = 100;

    void damaged(final int damagePoint) {
        int tmp = hitPoint - damagePoint;
        if (tmp < 0) {
            hitPoint = 0;
            System.out.println("You're dead.");
        }
        hitPoint = tmp;
    }

    boolean isDead() {
        return hitPoint == 0;
    }

    void SingleFighterAttack(Member target) {
        FighterPhysicalAttack fighterAttack = new FighterPhysicalAttack(target);
        fighterAttack.singleAttackDamage();
    }

    void DoubleFighterAttack(Member target) {
        FighterPhysicalAttack fighterAttack = new FighterPhysicalAttack(target);
        fighterAttack.doubleAttackDamage();
    }

}
