package Ch7.TeamAttack;

import java.util.Random;

public class Member {
  public boolean hasTeamAttackSucceeded() {
    return true;
  }

  public Damage attack() {
    final int amount =  new Random().nextInt(20, 50);
    return new Damage(amount);
  }
}
