package example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 08. List에 저장되어 있는 Member를 직업별로 그룹핑해서 Map<String, List<String>> 객체로 생성하려고 합니다.
 * 키는 Member의 작업이고, 값은 Member의 이름으로 구성된 List<String> 입니다. 빈칸에 알맞은 코드를 작성해보세요.
 */
public class Ex08 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", "개발자"),
        new Member("김나리", "디자이너"),
        new Member("김남준", "개발자")
    );

    Map<String, List<String>> groupingMap = list.stream()
        .collect(
            Collectors.groupingBy(
                Member::getJob,
                Collectors.mapping(Member::getName, Collectors.toList()
                )
            )
        );

    System.out.println("[개발자]");
    groupingMap.get("개발자").forEach(s -> System.out.println(s + " "));
    System.out.println("[디자이너]");
    groupingMap.get("디자이너").forEach(s -> System.out.println(s + " "));
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
