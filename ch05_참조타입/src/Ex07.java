/**
 * 07. 주어진 배열의 항목에서 최대값을 구해보세요(for 문을 활용하세요.)
 */
public class Ex07 {
  public static void main(String[] args) {
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};

    for (int i = 0; i < array.length; i++) {
      if (array[i] > array[max])
        max = i;
    }

    System.out.println("max : " + array[max]);
  }
}
