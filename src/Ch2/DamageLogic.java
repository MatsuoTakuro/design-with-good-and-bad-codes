package Ch2;

public class DamageLogic {
    int playerArmPower;
    int playerWeaponPower;
    int enemyBodyDefence;
    int enemyArmorDefence;

    public int damageMethod() {
        int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
        int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;

        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }
        return damageAmount;
    }
}
