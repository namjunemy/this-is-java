package advanced_search_collection.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx02 {
  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();
    scores.put(87, "홍길동");
    scores.put(98, "이동수");
    scores.put(75, "박길순");
    scores.put(95, "신용권");
    scores.put(80, "김자바");
    System.out.println(scores);

    NavigableMap<Integer, String> descendingMap = scores.descendingMap();
    Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
    for(Map.Entry<Integer, String> entry : descendingEntrySet) {
      System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
    }
    System.out.println();

    NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
    Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
    for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
      System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
    }
    System.out.println();
  }
}
