package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
        new Student("홍길동", 92),
        new Student("김남준", 90),
        new Student("김자바", 82)
    );

    double avg = list.stream()
        .mapToInt(Student::getScore)
        .average()
        .getAsDouble();

    System.out.println("평균점수: " + avg);

  }
}
