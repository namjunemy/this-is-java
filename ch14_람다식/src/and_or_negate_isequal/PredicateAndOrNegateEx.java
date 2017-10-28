package and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {
  public static void main(String[] args) {
    IntPredicate predicateA = a -> a % 2 == 0;
    IntPredicate predicateB = b -> b % 3 == 0;
    IntPredicate predicateAB = predicateA.and(predicateB);

    int input = 6;
    boolean result = predicateAB.test(input);
    System.out.println(input + "은/는 2의 배수이면서 3의 배수인가? " + result);

    input = 4;
    predicateAB = predicateA.or(predicateB);
    result = predicateAB.test(input);
    System.out.println(input + "은/는 2의 배수 또는 3의 배수 인가? " + result);

    input = 4;
    predicateAB = predicateA.negate();
    result = predicateAB.test(input);
    System.out.println(input + "은/는 2의 배수가 아닌가? " + result);
  }
}
