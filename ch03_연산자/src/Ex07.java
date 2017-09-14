/**
 * 7. 다음 코드는 비교 연산자와 논리 연산자의 복합 연산식입니다.
 * 연산식의 출력결과를 괄호속에 넣으세요.
 */
public class Ex07 {
  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    System.out.println((x > 7) && (y <= 5));  //(true)
    System.out.println((x % 3 == 2) || (y % 2 != 1));  //(false)
  }
}
