package Ch6.Damage;

public class HitPointDamage implements Damage{
    final Member member;

    HitPointDamage(final Member member) {
        this.member = member;
    }
    public void execute(final int damageAmount) {
        member.hitPoint -= damageAmount;
        if (0 < member.hitPoint) return;

        member.hitPoint = 0;
        member.addState(StateType.dead);
    }
}
