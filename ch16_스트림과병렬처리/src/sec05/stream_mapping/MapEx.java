package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

public class MapEx {
  public static void main(String[] args) {
    List<Student> studentList = Arrays.asList(
        new Student("홍길동", 10),
        new Student("신용권", 20),
        new Student("김남준", 30)
    );

    studentList.stream()
        .mapToInt(Student::getScore)
        .forEach(System.out::println);

  }
}
