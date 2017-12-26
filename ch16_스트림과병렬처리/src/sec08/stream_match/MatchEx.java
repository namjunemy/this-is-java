package sec08.stream_match;

import java.util.Arrays;

public class MatchEx {
  public static void main(String[] args) {
    int[] intArray = {2, 4, 6};

    boolean result = Arrays.stream(intArray).allMatch(a -> a % 2 == 0);
    System.out.println("모두 2의 배수인가? " + result);

    result = Arrays.stream(intArray).anyMatch(a -> a % 3 == 0);
    System.out.println("3의 배수가 있는가? " + result);

    result = Arrays.stream(intArray).noneMatch(a -> a % 3 == 0);
    System.out.println("3의 배수가 없는가? " + result);
  }
}
