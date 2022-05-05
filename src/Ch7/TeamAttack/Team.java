package Ch7.TeamAttack;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Member> team;

    Team(List<Member> team) {
        this.team = team;
    }

    public int attack() {
        int totalDamage = 0;
        for (Member member : team) {
            if (!member.hasTeamAttackSucceeded()) break;

            int damage = (int) (member.attack() * 1.1);

            if (damage < 30) break;

            totalDamage += damage;
        }
        return totalDamage;
    }

}
