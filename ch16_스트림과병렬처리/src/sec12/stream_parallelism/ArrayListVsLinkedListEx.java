package sec12.stream_parallelism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListEx {
  public static void work(int value) {
  }

  public static long testParallel(List<Integer> list) {
    long start = System.nanoTime();
    list.stream().parallel().forEach(ArrayListVsLinkedListEx::work);
    long end = System.nanoTime();
    long runTime = end - start;
    return runTime;
  }

  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < 1000000; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }

    long arrayListParallel = testParallel(arrayList);
    long linkedListParallel = testParallel(linkedList);

    arrayListParallel = testParallel(arrayList);
    linkedListParallel = testParallel(linkedList);

    if (arrayListParallel < linkedListParallel) {
      System.out.println("성능 테스트 결과: ArrayList가 더 빠름");
    } else {
      System.out.println("성능 테스트 결과: LinkedList가 더 빠름");
    }
  }
}
