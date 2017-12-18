package advanced_search_collection.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx03 {
  public static void main(String[] args) {
    TreeSet<String> treeSet = new TreeSet<>();

    treeSet.add("apple");
    treeSet.add("forever");
    treeSet.add("description");
    treeSet.add("ever");
    treeSet.add("zoo");
    treeSet.add("base");
    treeSet.add("guess");
    treeSet.add("cherry");
    treeSet.add("f");
    treeSet.add("c");

    System.out.println("[c~f사이의 단어 검색]");
    NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
    System.out.println(rangeSet);
  }
}
