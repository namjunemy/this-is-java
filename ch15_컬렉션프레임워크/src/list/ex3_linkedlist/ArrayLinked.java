package list.ex3_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린 시간 : " + (endTime - startTime) + "ns");

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("linkedList 걸린 시간 : " + (endTime - startTime) + "ns");
  }
}
