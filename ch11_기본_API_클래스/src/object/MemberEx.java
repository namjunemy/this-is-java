package object;

public class MemberEx {
  public static void main(String[] args) {
    Member member1 = new Member("one");
    Member member2 = new Member("one");
    Member member3 = new Member("three");

    if(member1.equals(member2)) {
      System.out.println("1과 2는 동등합니다.");
    } else {
      System.out.println("1과 2는 동등하지 않습니다.");
    }

    if(member1.equals(member3)) {
      System.out.println("1과 3은 동등합니다.");
    } else {
      System.out.println("1과 3은 동등하지 않습니다.");
    }
  }
}
