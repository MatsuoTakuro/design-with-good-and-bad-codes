package Ch4;

public class Member {
    final HitPoint hitPoint;
    final States states;

    public Member(HitPoint hitPoint, States states) {
        this.hitPoint = hitPoint;
        this.states = states;
    }
    void damaged(final int damagedAmount) {
        hitPoint.damage(damagedAmount);
        if (hitPoint.isZero()) {
            // prefer to update states?
            states.add(StateType.dead);
        }
    }
}
