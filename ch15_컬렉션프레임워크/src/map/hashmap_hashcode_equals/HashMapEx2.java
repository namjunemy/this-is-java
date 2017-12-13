package map.hashmap_hashcode_equals;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
  public static void main(String[] args) {
    Map<Student, Integer> map = new HashMap<>();

    map.put(new Student(1, "홍길동"), 95);
    map.put(new Student(1, "홍길동"), 97);

    System.out.println("총 Entry 수 : " + map.size());
    System.out.println(map.get(new Student(1, "홍길동")));
  }
}
