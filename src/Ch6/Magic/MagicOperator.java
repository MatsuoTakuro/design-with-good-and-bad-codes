package Ch6.Magic;

import java.util.HashMap;
import java.util.Map;

public class MagicOperator {
    private Member member;
    Map<MagicType, Magic> magics = new HashMap<>();

    private MagicOperator(Member member) {
        this.member = member;
        prepareMagic();
    }

    public static MagicOperator newMagicOperator(Member member) {
        return new MagicOperator(member);
    }

    void prepareMagic() {
        final Fire fire = new Fire(member);
        final Shiden shiden = new Shiden(member);
        final HellFire hellFire = new HellFire(member);

        magics.put(MagicType.FIRE, fire);
        magics.put(MagicType.SHIDEN, shiden);
        magics.put(MagicType.HELLFIRE, hellFire);
    }

    void magicAttack(final MagicType magicType, final Member opponent) {
        final Magic usingMagic = magics.get(magicType);
        if (!member.canUse(usingMagic)) { throw new IllegalArgumentException("You can not use " + usingMagic.name()); }

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic, opponent);
    }

    void showMagicName(final Magic magic) {
        final String name = magic.name();
        System.out.println("name: " + name);
    }

    void consumeMagicPoint(final Magic magic) {
        final MagicPoint costMagicPoint = magic.costMagicPoint();
        System.out.println(magic.name() + "'s costMagicPoint: " + costMagicPoint.value);
        member.consume(costMagicPoint);
    }

    void consumeTechnicalPoint(final Magic magic) {
        final TechnicalPoint costTechnicalPoint = magic.costTechnicalPoint();
        System.out.println(magic.name() + "'s costTechnicalPoint: " + costTechnicalPoint.value);
        member.consume(costTechnicalPoint);
    }

    void magicDamage(final Magic magic, final Member opponent) {
        final AttackPower attackPower = magic.attackPower();
        System.out.println(magic.name() + "'s attackPower: " + attackPower.value);
        opponent.damaged(attackPower);
    }


}
