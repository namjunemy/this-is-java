package argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {
  public static void main(String[] args) {
    ToIntBiFunction<String, String> function;

    function = (a, b) -> a.compareToIgnoreCase(b);
    print(function.applyAsInt("java8", "JAVA8"));

    function = String :: compareToIgnoreCase;
    print(function.applyAsInt("java8", "JAVA8"));
  }

  public static void print(int order) {
    if(order < 0) {
      System.out.println("사전순으로 먼저 옵니다.");
    } else if(order == 0) {
      System.out.println("동일한 문자열 입니다.");
    } else {
      System.out.println("사전순으로 나중에 옵니다.");
    }
  }
}
