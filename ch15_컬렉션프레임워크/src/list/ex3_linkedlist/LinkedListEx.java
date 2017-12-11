package list.ex3_linkedlist;

import java.util.LinkedList;

public class LinkedListEx {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("김남준");
    linkedList.add("최선호");
    linkedList.add("이수빈");

    linkedList.forEach((string) -> {
      if(string.length() > 0) {
        System.out.println(string);
        System.out.println(linkedList.indexOf(string));
      }
    });
  }
}
