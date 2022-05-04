package Ch6.Magic;

import java.util.Random;

public class Member {
    final public int level;
    final public int agility;
    final public int magicAttack;
    final public int vitality;

    private MagicPoint magicPoint;
    private TechnicalPoint technicalPoint;
    private Ch6.Magic.HitPoint hitPoint;


    private Member(int level, int agility, int magicAttack, int vitality, MagicPoint magicPoint, TechnicalPoint technicalPoint, HitPoint hitPoint) {
//      TODO: Too many instance variables...
        this.level = level;
        this.agility = agility;
        this.magicAttack = magicAttack;
        this.vitality = vitality;
        this.magicPoint = magicPoint;
        this.technicalPoint = technicalPoint;
        this.hitPoint = hitPoint;
    }

    static public Member newRandomMember() {
        Random rand = new Random();
        final int level = rand.nextInt(10);
        final int agility = rand.nextInt(10);
        final int magicAttack = rand.nextInt(10);
        final int vitality = rand.nextInt(10);

        final MagicPoint magicPoint = new MagicPoint(30);
        final TechnicalPoint technicalPoint = new TechnicalPoint(30);
        final Ch6.Magic.HitPoint hitPoint = new Ch6.Magic.HitPoint(100);

        return new Member(level, agility, magicAttack, vitality, magicPoint, technicalPoint, hitPoint);
    }

    public void attack(final MagicType magicType, final Member opponent) {
        if (!(canAttack(opponent))) { throw new IllegalArgumentException("Your opponent is already dying."); }
        MagicOperator mgcOperator = MagicOperator.newMagicOperator(this);
        mgcOperator.magicAttack(magicType, opponent);
    }

    public void consume(MagicPoint costMagicPoint) {
        magicPoint = magicPoint.minus(costMagicPoint);
        System.out.println("current magicPoint: " + magicPoint.value);
    }

    public void consume(TechnicalPoint costMagicPoint) {
        technicalPoint = technicalPoint.minus(costMagicPoint);
        System.out.println("current technicalPoint: " + technicalPoint.value);
    }

    public void damaged(AttackPower attackedPower) {
        hitPoint = hitPoint.minus(attackedPower);
        System.out.println("current hitPoint: " + hitPoint.value);
    }

    public boolean canUse(Magic magic) {
        if (magicPoint.lessThan(magic.costMagicPoint().value)) return false;
        if (technicalPoint.lessThan(magic.costTechnicalPoint().value)) return false;

        return true;
    }

    public boolean canAttack(Member opponent) {
        return !(opponent.hitPoint.isZero());
    }
}
