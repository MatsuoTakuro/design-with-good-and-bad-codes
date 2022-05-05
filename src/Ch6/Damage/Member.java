package Ch6.Damage;

import java.util.*;

public class Member {
  public int hitPoint;
  public int magicPoint;

  public Set<StateType> states = new TreeSet<>();

  private Member(int hitPoint, int magicPoint) {
    this.hitPoint = hitPoint;
    this.magicPoint = magicPoint;
  }

  public void addState(StateType state) {
    this.states.add(state);
  }

  public static Member newMember(int hitPoint, int magicPoint) {
    return new Member(hitPoint, magicPoint);
  }

  public void applyDamage(final DamageType damageType, final int damageAmount) {
    Damage damage = damageType.newDamage(this, damageType);
    damage.execute(damageAmount);
  }
}
