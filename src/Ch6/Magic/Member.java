package Ch6.Magic;

import java.util.Random;

public class Member {
    final public int level;
    final public int agility;
    final public int magicAttack;
    final public int vitality;

    private Member(int level, int agility, int magicAttack, int vitality) {
        this.level = level;
        this.agility = agility;
        this.magicAttack = magicAttack;
        this.vitality = vitality;
    }

    static public Member newRandomMember() {
        Random rand = new Random();
        final int level = rand.nextInt(10);
        final int agility = rand.nextInt(10);
        final int magicAttack = rand.nextInt(10);
        final int vitality = rand.nextInt(10);
        return new Member(level, agility, magicAttack, vitality);
    }

    public void attack(final MagicType magicType) {
        MagicSwitch sw = MagicSwitch.newMagicSwitch(this);
        sw.magicAttack(magicType);
    }
}
