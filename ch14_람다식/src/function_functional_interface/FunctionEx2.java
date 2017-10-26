package function_functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionEx2 {
  private static List<Student> list = Arrays.asList(
      new Student("namjune1", 100, 100),
      new Student("namjune2", 99, 99)
  );

  public static double avg(ToIntFunction<Student> function) {
    int sum = 0;
    for (Student student : list) {
      sum += function.applyAsInt(student);
    }
    double avg = (double) sum / list.size();
    return avg;
  }

  public static void main(String[] args) {
    double englishAvg = avg(t -> t.getEnglishScore());
    System.out.println("[영어 평균 점수]");
    System.out.println(englishAvg);

    System.out.println();

    double mathAvg = avg(t -> t.getMathScore());
    System.out.println("[수학 평균 점수]");
    System.out.println(mathAvg);
  }
}
