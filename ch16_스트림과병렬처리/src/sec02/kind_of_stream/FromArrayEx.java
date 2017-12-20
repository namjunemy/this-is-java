package sec02.kind_of_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
  public static void main(String[] args) {
    String[] stringArray = {"홍길동", "신용권", "김미나"};
    Stream<String> stringStream = Arrays.stream(stringArray);
    stringStream.forEach(a -> System.out.print(a + ","));
    System.out.println();

    int[] intArray = {1, 2, 3, 4, 5};
    IntStream intStream = Arrays.stream(intArray);
    intStream.forEach(a -> System.out.print(a + ","));
  }
}
