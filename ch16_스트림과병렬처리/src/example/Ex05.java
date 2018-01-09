package example;

import java.util.Arrays;
import java.util.List;

/**
 * 05. List에 저장되어 있는 String 요소에서 대소문자와 상관없이 "java"라는 단어가 포함된 문자열만 필터링해서
 * 출력하려고 합니다 빈칸에 알맞은 코드를 작성해보세요.
 */
public class Ex05 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expressions",
        "Java8 supports lambda expressions"
    );
    list.stream()
        .filter(s -> s.toLowerCase().contains("java"))
        .forEach(System.out::println);
  }
}
