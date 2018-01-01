package sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEx {
  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Student.Sex.MALE, Student.City.BUSAN),
        new Student("홍길순", 12, Student.Sex.FEMALE, Student.City.SEOUL),
        new Student("김남", 10, Student.Sex.MALE, Student.City.SEOUL),
        new Student("김여", 8, Student.Sex.FEMALE, Student.City.BUSAN)
    );

    Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
        .collect(Collectors.groupingBy(Student::getSex));

    System.out.println("[남학생]");
    mapBySex.get(Student.Sex.MALE)
        .forEach(s -> System.out.print(s.getName() + " "));
    System.out.println("\n[여학생]");
    mapBySex.get(Student.Sex.FEMALE)
        .forEach(s -> System.out.print(s.getName() + " "));

    System.out.println();

    Map<Student.City, List<String>> mapByCity = totalList.stream()
        .collect(
            Collectors.groupingBy(
                Student::getCity,
                Collectors.mapping(Student::getName, Collectors.toList())
            )
        );

    System.out.println("\n[서울]");
    mapByCity.get(Student.City.SEOUL)
        .forEach(name -> System.out.print(name + " "));
    System.out.println("\n[부산]");
    mapByCity.get(Student.City.BUSAN)
        .forEach(name -> System.out.print(name + " "));
  }
}
