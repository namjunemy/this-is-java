package sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamEx {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("홍길동", "신용권", "김남준");
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
    }

    Stream<String> stream = list.stream();
    stream.forEach(name -> System.out.println(name));
  }
}
