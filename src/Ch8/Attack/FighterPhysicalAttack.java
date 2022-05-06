package Ch8.Attack;

public class FighterPhysicalAttack {
    private final Member target;
    private final PhysicalAttack physicalAttack;


    FighterPhysicalAttack(final Member target) {
        this.target = target;
        this.physicalAttack = physicalAttack();
    }

    void singleAttackDamage() {
        physicalAttack.singleAttackDamage();
        target.damaged(20);
    }

    void doubleAttackDamage() {
        physicalAttack.doubleAttackDamage();
        target.damaged(10);
    }

    private PhysicalAttack physicalAttack() {
        return new PhysicalAttack(target);
    }
}
