package objects.compare;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorEx {
  public static void main(String[] args) {
    Student s1 = new Student(1);
    Student s2 = new Student(1);
    Student s3 = new Student(2);

    int result = Objects.compare(s1, s2, new StudentComparator());
    System.out.println(result);
    int result2 = Objects.compare(s1, s3, new StudentComparator());
    System.out.println(result2);
  }

  static class Student {
    int sno;

    Student(int sno) {
      this.sno = sno;
    }
  }

  static class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return Integer.compare(o1.sno, o2.sno);
    }
  }
}
