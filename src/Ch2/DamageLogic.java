package Ch2;

public class DamageLogic {

    int sumUpPlayerAttackPower(int playerArmPlayer, int playerWeaponPower) {
        return playerArmPlayer + playerWeaponPower;
    }

    int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0) {
            return 0;
        }
        return damageAmount;
    }
}
