package Ch8.Attack;

public class PhysicalAttack {

    private final Member target;

    PhysicalAttack(final Member target) {
        this.target = target;
    }
    void singleAttackDamage() {
        if (target.isDead()) return;
        target.damaged(10);
    }

    void doubleAttackDamage() {
        if (target.isDead()) return;
        target.damaged(25);
    }
}
