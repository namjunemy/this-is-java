package operator;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
  private static int[] scores = {92, 34, 87};

  private static int maxOrMin(IntBinaryOperator intBinaryOperator) {
    int result = scores[0];
    for (int score : scores) {
      result = intBinaryOperator.applyAsInt(result, score);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin(
        (result, score) -> {
          if (result >= score) return result;
          else return score;
        }
    );
    System.out.println(max);

    int min = maxOrMin(
        (result, score) -> {
          if (result <= score) return result;
          else return score;
        }
    );
    System.out.println(min);
  }
}
