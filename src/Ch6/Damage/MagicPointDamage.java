package Ch6.Damage;

public class MagicPointDamage implements Damage{
    final Member member;

    MagicPointDamage(final Member member) {
        this.member = member;
    }
    public void execute(final int damageAmount) {
        member.magicPoint -= damageAmount;
        if (0 < member.magicPoint) return;

        member.magicPoint = 0;
    }
}
