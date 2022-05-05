package Ch7.Poison;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Member {
  public int hitPoint = new Random().nextInt(1, 20);
  List<StateType> states = new ArrayList<>();

  public static Member newPoisonedMember() {
    Member member = new Member();
    member.states.add(StateType.poisoned);
    return member;
  }
  public boolean containsState(StateType stateType) {
    return states.contains(stateType);
  }

  public void addState(StateType stateType) {
    if (containsState(stateType)) return;
    states.add(stateType);
  }

  public void removeState(StateType stateType) {
    if (!containsState(stateType)) {
      System.out.println("You are not " + stateType.name() + ".");
      return;
    }
    states.remove(stateType);
  }
}
