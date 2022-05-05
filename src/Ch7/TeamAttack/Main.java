package Ch7.TeamAttack;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();
        Team team = new Team(Arrays.asList(member1, member2, member3));
        System.out.println(team.attack());
    }
}
