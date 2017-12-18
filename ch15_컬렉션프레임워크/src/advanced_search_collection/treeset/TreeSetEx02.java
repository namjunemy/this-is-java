package advanced_search_collection.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx02 {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();

    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);
    System.out.println(scores);

    NavigableSet<Integer> descendingSet = scores.descendingSet();
    System.out.println("descendingSet");
    for(int score : descendingSet) {
      System.out.print(score + " ");
    }

    System.out.println();
    System.out.println("ascendingSet");
    NavigableSet<Integer> ascendSet = descendingSet.descendingSet();
    for(int score : ascendSet) {
      System.out.print(score + " ");
    }
  }
}
