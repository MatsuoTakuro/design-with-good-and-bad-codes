package Ch5.Equipment;

public class Equipments {
    private boolean canChangeAnyEquipment = true;
    private Equipment head;
    private Equipment armor;
    private Equipment arm;


    private Equipments() {
        deactivateAll();
    }

    public static Equipments newEquipments() {
        return new Equipments();
    }

    public void equipArmor(final Equipment newArmor) {
        if (newArmor.type() == null) { throw new IllegalArgumentException("new armor is empty."); }
        if (!(newArmor.type().equals(EquipmentType.ARMOR))) { throw new IllegalArgumentException("new equipment is not an armor."); }
        if (!canChangeAnyEquipment) { throw new IllegalArgumentException("equipments can't be changed."); }

        armor = newArmor;
    }

    public void deactivateAll() {
        head  = Equipment.Empty;
        armor = Equipment.Empty;
        arm   = Equipment.Empty;
    }
}
