package Ch6.Magic;

import java.util.HashMap;
import java.util.Map;

public class MagicSwitch {
    private Member member;
    Map<MagicType, Magic> magics = new HashMap<>();

    private MagicSwitch(Member member) {
        this.member = member;
        method();
    }

    public static MagicSwitch newMagicSwitch(Member member) {
        return new MagicSwitch(member);
    }

    void method() {
        final Fire fire = new Fire(member);
        final Shiden shiden = new Shiden(member);
        final HellFire hellFire = new HellFire(member);

        magics.put(MagicType.FIRE, fire);
        magics.put(MagicType.SHIDEN, shiden);
        magics.put(MagicType.HELLFIRE, hellFire);
    }

    void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic);
    }

    void showMagicName(final Magic magic) {
        final String name = magic.name();
        System.out.println("name: " + name);
    }

    void consumeMagicPoint(final Magic magic) {
        final MagicPoint costMagicPoint = magic.costMagicPoint();
        System.out.println("costMagicPoint: " + costMagicPoint.value);

    }

    void consumeTechnicalPoint(final Magic magic) {
        final TechnicalPoint costTechnicalPoint = magic.costTechnicalPoint();
        System.out.println("costTechnicalPoint: " + costTechnicalPoint.value);

    }

    void magicDamage(final Magic magic) {
        final AttackPower attackPower = magic.attackPower();
        System.out.println("attackPower: " + attackPower.value);
    }


}
