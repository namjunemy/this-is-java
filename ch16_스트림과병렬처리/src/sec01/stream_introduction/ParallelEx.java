package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("홍길동","신용권","김남준","람다식","병렬처리");

    Stream<String> stream = list.stream();
    stream.forEach(ParallelEx::print);

    Stream<String> parallelStream = list.parallelStream();
    parallelStream.forEach(ParallelEx::print);
  }

  public static void print(String string) {
    System.out.println(string + " : " + Thread.currentThread().getName());
  }
}
