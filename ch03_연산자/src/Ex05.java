/**
 * 5. 변수 value의 값이 356이라면 300이 나올 수 있도록 알맞은 코드를 작성하세요. (산술연산자만사용)
 */

public class Ex05 {
  public static void main(String[] args) {
    int value = 356;
    System.out.println(value - value % 100);
  }
}
