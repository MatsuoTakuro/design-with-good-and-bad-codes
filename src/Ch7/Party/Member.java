package Ch7.Party;

public class Member {
  public final int id;

  public Member(final int id) {
    this.id = id;
  }

  public boolean isAlive() {
    return true;
  }

  @Override
  public String toString() {
    return String.valueOf(id);
  }
}
