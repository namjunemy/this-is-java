package sec09.stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    OptionalDouble optional = list.stream()
        .mapToInt(Integer::intValue)
        .average();
    if(optional.isPresent()) {
      System.out.println("방법1 평균: " + optional.getAsDouble());
    } else {
      System.out.println("방법1 평균: 0.0");
    }

    double avg = list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
    System.out.println("orElse를 이용한 평균: " + avg);

    list.add(2);
    list.add(4);
    list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .ifPresent(a -> System.out.println("isPresent를 이용한 평균: " + a));
  }
}
