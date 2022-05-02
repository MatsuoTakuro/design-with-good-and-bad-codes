package Ch4;

public class Main {
    public static void main(String[] args) {
        Member m = new Member(new HitPoint(), new States());
        m.damaged(50);
        System.out.println(m.hitPoint.amount);
        System.out.println(m.states.list);
        m.damaged(50);
        System.out.println(m.hitPoint.amount);
        System.out.println(m.states.list);
    }
}
