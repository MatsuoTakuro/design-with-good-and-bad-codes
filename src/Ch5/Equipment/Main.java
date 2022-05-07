package Ch5.Equipment;

public class Main {
    public static void main(String[] args) {
        Equipment armorX = Equipment.newArmor("armorX", 100, 200);
        Equipments currentEquips = Equipments.newEquipments();
        Equipments newEquips =  currentEquips.equipArmor(armorX);
        System.out.println(newEquips);
        Equipments emptyEquips = newEquips.emptyAll();
        System.out.println(emptyEquips);
    }
}

