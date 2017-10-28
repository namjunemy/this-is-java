package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
  private static List<Student> list = Arrays.asList(
      new Student("김남준", "남", 100),
      new Student("김남순", "여", 100),
      new Student("김남준1", "남", 90),
      new Student("김남순2", "여", 80)
  );

  public static double avg(Predicate<Student> predicate) {
    int count = 0;
    int sum = 0;
    for (Student student : list) {
      if (predicate.test(student)) {
        sum += student.getScore();
        count++;
      }
    }
    return sum / count;
  }

  public static void main(String[] args) {
    double maleAvg = avg(student -> student.getSex().equals("남"));
    System.out.println("남자 점수 평균: " + maleAvg);

    double femaleAvg = avg(student -> student.getSex().equals("여"));
    System.out.println("여자 점수 평균: " + femaleAvg);
  }
}
