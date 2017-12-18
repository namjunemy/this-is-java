package example.ex08;

public class Student {
  private int no;
  private String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if(o instanceof Student) {
      Student member = (Student) o;
      return member.getNo() == no;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return no;
  }

  @Override
  public String toString() {
    return "Student{" +
        "no=" + no +
        ", name='" + name + '\'' +
        '}';
  }
}
