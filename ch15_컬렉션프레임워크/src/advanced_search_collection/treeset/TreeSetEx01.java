package advanced_search_collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx01 {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();

    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);

    System.out.println("최소값(first): " + scores.first());
    System.out.println("최대값(last): " + scores.last());
    System.out.println("95 아래에 있는 값(미만, lower): " + scores.lower(95));
    System.out.println("95 위에 있는 값(초과, higher): " + scores.higher(95));
    System.out.println("95이거나 바로 아래 있는 값(이하, floor): " + scores.floor(95));
    System.out.println("95이거나 바로 위에 있는 값(이상, ceiling): " + scores.ceiling(95));
    System.out.println();

    System.out.println("Iterator");
    Iterator<Integer> iterator = scores.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println();

    System.out.println("최소값(pollFirst)/최대값(pollLast) 추출 후 set에서 제거");
    while (!scores.isEmpty()) {
      int score = scores.pollFirst();
//      int score = scores.pollLast();
      System.out.print("빼낸 값: " + score);
      System.out.println(" / 남은 객체 수: " + scores.size());
    }
    System.out.println();
  }
}
