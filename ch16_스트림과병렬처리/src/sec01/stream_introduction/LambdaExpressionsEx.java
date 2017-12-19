package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsEx {
  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
        new Student("홍길동", 92),
        new Student("김남준", 90)
    );

    Stream<Student> stream = list.stream();

    stream.forEach(s -> {
      String name = s.getName();
      int score = s.getScore();
      System.out.println(name + "-" + score);
    });
  }
}
