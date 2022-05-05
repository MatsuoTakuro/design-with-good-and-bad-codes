package Ch7.TeamAttack;

import java.util.List;

public class Team {
    List<Member> team;

    Team(List<Member> team) {
        this.team = team;
    }

    public Damage attack() {
        int totalAmount = 0;
        for (Member member : team) {
            if (!member.hasTeamAttackSucceeded()) break;

            final Damage damage  = new Damage((int) (member.attack().amount * 1.1));

            if (damage.amount < 30) break;

            totalAmount += damage.amount;
        }
        return new Damage(totalAmount);
    }

}
