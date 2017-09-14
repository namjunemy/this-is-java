package example.ex03;

import java.util.HashMap;

public class StudentEx {
  public static void main(String[] args) {
    HashMap<Student, String> hashMap = new HashMap<>();

    hashMap.put(new Student("1"), "95");

    String score = hashMap.get(new Student("1"));
    System.out.println("1번 학생의 총점: " + score);
  }
}