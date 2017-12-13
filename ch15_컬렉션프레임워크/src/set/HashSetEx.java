package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("java");
    set.add("JDBC");
    set.add("java");
    set.add("Servlet/JSP");
    set.add("mybatis");

    System.out.println(set.size());

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

    System.out.println();
    for (String str : set) {
      System.out.print(str + " ");
    }

    System.out.println();
    set.clear();
    System.out.println(set);
  }
}
