package Ch7.Poison;

import java.util.List;

public class Poison {

    public void damageAll(final List<Member> members) {
        for (Member member : members) {
            if (member.hitPoint == 0) continue;
            if (!member.containsState(StateType.poisoned)) continue;

            member.hitPoint -= 10;

            if (0 < member.hitPoint) continue;

            member.hitPoint = 0;
            member.addState(StateType.dead);
            member.addState(StateType.poisoned);
        }
    }
}
