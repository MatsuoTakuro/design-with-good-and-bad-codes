package Ch7.Party;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Party {
    static final int MAX_MEMBER_COUNT = 4;
    private final List<Member> members;

    Party() {
        members = new ArrayList<>();
    }

    private Party(List<Member> members) {
        this.members = members;
    }

    Party add(final Member newMember) {
        if (exists(newMember)) {
            throw new RuntimeException("The new member has already joined this party.");
        }
        if (isFull()) {
            throw new RuntimeException("No more members can be added into this party.");
        }

        final List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }

    boolean isAllAlive() {
        return members.stream().anyMatch(Member::isAlive);
    }

    boolean exists(final Member member) {
        return members.stream().anyMatch(each -> each.id == member.id);
    }

    boolean isFull() {
        return members.size() == MAX_MEMBER_COUNT;
    }

    int size() {
        return members.size();
    }

    List<Member> members() {
        return Collections.unmodifiableList(members);
    }
}
