package sec11.stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListEx {
  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Student.Sex.MALE),
        new Student("홍길순", 12, Student.Sex.FEMALE),
        new Student("김남", 10, Student.Sex.MALE),
        new Student("김여", 8, Student.Sex.FEMALE)
    );

    List<Student> maleList = totalList.stream()
        .filter(s -> s.getSex() == Student.Sex.MALE)
        .collect(Collectors.toList());
    maleList.forEach(s -> System.out.println(s.getName()));

    Set<Student> femaleSet = totalList.stream()
        .filter(s -> s.getSex() == Student.Sex.FEMALE)
        .collect(Collectors.toCollection(HashSet::new));
    femaleSet.forEach(s -> System.out.println(s.getName()));
  }
}
