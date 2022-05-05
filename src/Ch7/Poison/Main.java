package Ch7.Poison;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Member member1 = Member.newPoisonedMember();
        Member member2 = Member.newPoisonedMember();
        List<Member> members = Arrays.asList(member1, member2);
        new Poison().damageAll(members);
        for (Member member : members) {
            System.out.println(member.hitPoint);
            System.out.println(member.states);
        }
    }
}
