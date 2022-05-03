package Ch5.Equipment;

public class Equipment {
    static final Equipment Empty = new Equipment();
    private EquipmentType type;
    private int attackPower;
    private int defencePower;

    private Equipment() {}

    private Equipment(final EquipmentType type, final int attackPower, final int defencePower) {
        this.type = type;
        if (attackPower < 0) { throw new IllegalArgumentException(); }
        this.attackPower = attackPower;
        if (defencePower < 0) { throw new IllegalArgumentException(); }
        this.defencePower = defencePower;
    }

    public static Equipment newHead(final int attackPower, final int defencePower) {
        return new Equipment(EquipmentType.HEAD, attackPower, defencePower);
    }

    public static  Equipment newArmor(final int attackPower, final int defencePower) {
        return new Equipment(EquipmentType.ARMOR, attackPower, defencePower);
    }

    public static  Equipment newArm(final int attackPower, final int defencePower) {
        return new Equipment(EquipmentType.ARM, attackPower, defencePower);
    }

    public EquipmentType type() {
        return type;
    }
}
