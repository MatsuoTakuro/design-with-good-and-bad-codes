package Ch7.Party;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member(1);
        Member member2 = new Member(2);
        Member member3 = new Member(3);
        Member member4 = new Member(4);

        Party party = new Party();
        Party addedParty1 = party.add(member1);
        Party addedParty2 = addedParty1.add(member2);
        Party addedParty3 = addedParty2.add(member3);
        Party addedParty4 = addedParty3.add(member4);

        System.out.println(addedParty4.size());
        System.out.println(addedParty4.isAllAlive());
    }
}
