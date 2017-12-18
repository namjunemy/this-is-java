package advanced_search_collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {
  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();
    scores.put(87, "홍길동");
    scores.put(98, "이동수");
    scores.put(75, "박길순");
    scores.put(95, "신용권");
    scores.put(80, "김자바");

    Map.Entry<Integer, String> entry = scores.firstEntry();
    System.out.println("가장 작은 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    entry = scores.lastEntry();
    System.out.println("가장 큰 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    entry = scores.lowerEntry(95);
    System.out.println("95점 미만의 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    entry = scores.higherEntry(95);
    System.out.println("95점 초과의 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    entry = scores.floorEntry(95);
    System.out.println("95점 이상의 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    entry = scores.ceilingEntry(95);
    System.out.println("95점 이하의 키값을 가진 객체: " + entry.getKey() + ", " + entry.getValue());

    System.out.println("키의 값이 최소값(pollFirst)/최대값(pollLast)인 객체 추출 후 Map에서 제거");
    while (!scores.isEmpty()) {
      //entry = scores.pollFirstEntry();
      entry = scores.pollLastEntry();
      System.out.println(entry.getKey() + ", " + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
    }
  }
}
