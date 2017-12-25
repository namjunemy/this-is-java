package sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "김남준", "김남준");

    names.stream()
        .distinct()
        .forEach(System.out::println);
    System.out.println();

    names.stream()
        .filter(str -> str.startsWith("신"))
        .forEach(System.out::println);
    System.out.println();

    names.stream()
        .distinct()
        .filter(str -> str.endsWith("준"))
        .forEach(System.out::println);
  }
}
