package sec06.stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingEx {
  public static void main(String[] args) {
    IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4,});

    intStream.sorted().forEach(n -> System.out.print(n + ","));
    System.out.println();

    List<Student> studentList = Arrays.asList(
        new Student("홍길동", 30),
        new Student("신용권", 33),
        new Student("김남준", 25)
    );

    studentList.stream()
        .sorted()
        .forEach(student -> System.out.print(student.getScore() + ","));

    System.out.println();

    studentList.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(student -> System.out.print(student.getScore() + ","));

  }
}
