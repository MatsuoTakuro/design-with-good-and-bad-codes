package Ch5.Equipment;

public class Equipment {
    private static final Equipment EMPTY = new Equipment("No Equipment", EquipmentType.NONE, 0, 0);
    private final String name;
    private final EquipmentType type;
    private final int attackPower;
    private final int defencePower;

    private Equipment(final String name, final EquipmentType type, final int attackPower, final int defencePower) {
        if (name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
        this.type = type;
        if (attackPower < 0) throw new IllegalArgumentException();
        this.attackPower = attackPower;
        if (defencePower < 0) throw new IllegalArgumentException();
        this.defencePower = defencePower;
    }

    public static  Equipment newArmor(final String name, final int attackPower, final int defencePower) {
        return new Equipment(name, EquipmentType.ARMOR, attackPower, defencePower);
    }

    boolean isSameType(EquipmentType type) {
        return this.type.equals(type);
    }

    static Equipment empty() {
        return EMPTY;
    }

    @Override
    public String toString() {
        return name + ", " + type + ", " + attackPower + ", " + defencePower;
    }
}
