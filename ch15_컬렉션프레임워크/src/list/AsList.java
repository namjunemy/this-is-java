package list;

import java.util.Arrays;
import java.util.List;

public class AsList {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("김남준", "이수빈", "이근혁");
    for (String str : list1)
      System.out.println(str);

    List<Integer> list2 = Arrays.asList(1, 2, 3);
    for (int value : list2) {
      System.out.println(value);
    }
  }
}
