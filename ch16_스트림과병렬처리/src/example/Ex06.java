package example;

import java.util.Arrays;
import java.util.List;

/**
 * 06. List에 저장되어 있는 Member의 평균 나이를 출력하려고 합니다. 빈칸에 알맞은 코드를 작성해보세요.
 */
public class Ex06 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("김남준", 26)
    );

    double avg = list.stream()
        .mapToInt(Member::getAge)
        .average()
        .getAsDouble();
    System.out.println("평균 나이: " + avg);
  }

  static class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }
}
