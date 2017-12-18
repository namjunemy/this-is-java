package comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
  public static void main(String[] args) {
    TreeSet<Person> treeSet = new TreeSet<>();
    treeSet.add(new Person("김남준", 25));
    treeSet.add(new Person("신용권", 40));
    treeSet.add(new Person("김자바", 30));
    System.out.println(treeSet);

    Iterator<Person> iterator = treeSet.iterator();
    while(iterator.hasNext()) {
      Person person = iterator.next();
      System.out.println(person);
    }
  }
}
