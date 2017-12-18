package comparable;

public class Person implements Comparable<Person> {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Person o) {
    if (age < o.getAge()) return -1;
    else if (age == o.age) return 0;
    else return 1;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return age + "-" + name;
  }
}
