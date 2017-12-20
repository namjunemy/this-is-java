package sec02.kind_of_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
  public static void main(String[] args) {
    List<Student> studentList = Arrays.asList(
        new Student("홍길동", 10),
        new Student("김길동", 20),
        new Student("남길동", 30)
    );

    Stream<Student> stream = studentList.stream();
    stream.forEach(s -> System.out.println(s.getName()));
  }
}
