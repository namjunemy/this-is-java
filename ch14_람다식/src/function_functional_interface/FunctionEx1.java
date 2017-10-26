package function_functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {
  private static List<Student> list = Arrays.asList(
      new Student("namjune1", 100, 100),
      new Student("namjune2", 99, 99)
  );

  public static void printString(Function<Student, String> function) {
    list.forEach(student -> System.out.print(function.apply(student) + " "));
  }

  public static void printInt(ToIntFunction<Student> function) {
    list.forEach(student -> System.out.print(function.applyAsInt(student) + " "));
  }

  public static void main(String[] args) {
    System.out.println("[학생 이름]");
    printString(t -> t.getName());
    System.out.println();
    System.out.println("[영어 점수]");
    printInt(t -> t.getEnglishScore());
    System.out.println();
    System.out.println("[수학 점수]");
    printInt(t -> t.getMathScore());
  }
}
