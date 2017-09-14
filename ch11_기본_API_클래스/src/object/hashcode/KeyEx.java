package object.hashcode;

import java.util.HashMap;

public class KeyEx {
  public static void main(String[] args) {
    HashMap<Key, String> hashMap = new HashMap<>();

    hashMap.put(new Key(1), "김남준");

    String value = hashMap.get(new Key(1));
    System.out.println(value);
  }
}
