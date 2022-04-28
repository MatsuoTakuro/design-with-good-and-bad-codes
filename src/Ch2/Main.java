package Ch2;

public class Main {
    public static void main(String[] args) {
        int playerArmPlayer = 100;
        int playerWeaponPower = 100;
        int totalPlayerAttackPower = new DamageLogic().sumUpPlayerAttackPower(playerArmPlayer, playerWeaponPower);

        int enemyBodyDefence = 100;
        int enemyArmorDefence = 100;
        int totalEnemyDefence = new DamageLogic().sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
        int damageAmount = new DamageLogic().estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
        System.out.println(damageAmount);
    }
}
