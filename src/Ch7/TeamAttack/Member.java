package Ch7.TeamAttack;

import java.util.Random;

public class Member {
  public boolean hasTeamAttackSucceeded() {
    return true;
  }

  public int attack() {
    return new Random().nextInt(20, 50);
  }
}
