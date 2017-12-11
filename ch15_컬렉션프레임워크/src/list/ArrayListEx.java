package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Java");
    list.add("JDBC");
    list.add("Servlet/JSP");
    list.add(2, "Database");
    list.add("Mybatis");
    System.out.println(list.size());
    System.out.println(list);

    String skill = list.get(2);
    System.out.println("2: " + skill);

    list.forEach(str -> System.out.println(list.indexOf(str) + ":" + str + " "));
  }
}
