/**
 * 중첩 for문을 이용하여 방적식 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력해 보세요.
 * 단, x와 y는 10 이하의 자연수 입니다.
 */
public class Ex05 {
  public static void main(String[] args) {
    for (int x = 0; x < 11; x++) {
      for (int y = 0; y < 11; y++) {
        if ((4 * x) + (5 * y) == 60) {
          System.out.println("(" + x + "," + y + ")");
        }
      }
    }
  }
}
