/**
 * 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
 */
public class Ex03 {
  public static void main(String[] args) {
    int score = 85;
    String result = (!(score>90)) ? "가" : "나";
    System.out.println(result); //가
  }
}
