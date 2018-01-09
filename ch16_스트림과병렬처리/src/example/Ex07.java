package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 07. List에 저장되어 있는 Member 중에서 직업이 "개발자"인 사람만 별도의 List에 수집하려고 합니다.
 * 빈칸에 알맞은 코드를 작성해보세요.
 */
public class Ex07 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", "개발자"),
        new Member("김나리", "디자이너"),
        new Member("김남준", "개발자")
    );

    List<Member> developers = list.stream()
        .filter(s -> s.getJob().equals("개발자"))
        .collect(Collectors.toList());

    developers.forEach(s -> System.out.println(s.getName()));
  }

  static class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
      this.name = name;
      this.job = job;
    }

    public String getName() {
      return name;
    }

    public String getJob() {
      return job;
    }
  }
}
