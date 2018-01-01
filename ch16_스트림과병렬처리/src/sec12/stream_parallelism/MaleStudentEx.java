package sec12.stream_parallelism;

import sec11.stream_collect.Student;

import java.util.Arrays;
import java.util.List;

public class MaleStudentEx {
  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Student.Sex.MALE),
        new Student("홍길순", 12, Student.Sex.FEMALE),
        new Student("김남", 10, Student.Sex.MALE),
        new Student("김여", 8, Student.Sex.FEMALE)
    );

    System.out.println("람다");
    MaleStudent maleStudentListLambda = totalList.parallelStream()
        .filter(s -> s.getSex() == Student.Sex.MALE)
        .collect(
            () -> new MaleStudent(),
            (r, t) -> r.accumulate(t),
            (r1, r2) -> r1.combine(r2));
    maleStudentListLambda.getList().stream().forEach(s -> System.out.println(s.getName()));

    System.out.println("\n메소드 참조");
    MaleStudent maleStudentListMethodReference = totalList.parallelStream()
        .filter(s -> s.getSex() == Student.Sex.MALE)
        .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
    maleStudentListMethodReference.getList().stream().forEach(s -> System.out.println(s.getName()));
  }
}
