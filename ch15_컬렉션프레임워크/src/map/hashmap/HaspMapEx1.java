package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HaspMapEx1 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("신용권", 40);
    map.put("홍길동", 30);
    map.put("김남준", 32);
    map.put("홍길동", 32);
    System.out.println(map.size());
    System.out.println(map);

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

    System.out.println("##entrySet()");
    while(entryIterator.hasNext()) {
      Map.Entry<String, Integer> entry = entryIterator.next();
      System.out.print(entry.getKey() + " ");
      System.out.println(entry.getValue());
    }

    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();

    System.out.println("##keySet()");
    while(keyIterator.hasNext()) {
      String key = keyIterator.next();
      int value = map.get(key);
      System.out.println(key + " " + value);
    }

    map.clear();
    System.out.println(map.size());
  }
}
