package Ch5.EquipmentWithCh9NonNull;

public class Equipments {
    final private boolean canChangeAnyEquipment = true;
    final private Equipment head;
    final private Equipment armor;
    final private Equipment arm;


    private Equipments() {
        Equipments emptyEquipments = emptyAll();
        this.head = emptyEquipments.head;
        this.armor = emptyEquipments.armor;
        this.arm = emptyEquipments.arm;
    }

    private Equipments(final Equipment head, final Equipment armor, final Equipment arm) {
        this.head = head;
        this.armor = armor;
        this.arm = arm;
    }

    public static Equipments newEquipments() {
        return new Equipments();
    }

    public Equipments equipArmor(final Equipment newArmor) {
        if (!(newArmor.isSameType(EquipmentType.ARMOR))) { throw new IllegalArgumentException("new equipment is not an armor."); }
        if (!canChangeAnyEquipment) { throw new IllegalArgumentException("equipments can't be changed."); }

        return new Equipments(head, newArmor, arm);
    }

    public Equipments emptyAll() {
        return new Equipments(Equipment.empty(), Equipment.empty(), Equipment.empty());
    }

    @Override
    public String toString() {
        return "Equipments"      + "\n" +
               "head: "  + head  + "\n" +
               "armor: " + armor + "\n" +
               "arm: "   + arm;
    }
}
