import java.util.Scanner;

/**
 * while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금 출금 조회 종료 기능을 제공하는 코드를 작성해보세요.
 */
public class Ex07 {
  public static void main(String[] args) {
    boolean run = true;

    int balance = 0;
    Scanner scanner = new Scanner(System.in);
    while (run) {
      System.out.println("-----------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
      System.out.println("-----------------------------");
      System.out.print("선택 > ");

      int select = scanner.nextInt();

      switch (select) {
        case 1:
          System.out.print("입금액 : ");
          int input = scanner.nextInt();
          balance += input;
          System.out.println(input + "원이 입금됐습니다.");
          break;
        case 2:
          System.out.print("출금액 : ");
          int output = scanner.nextInt();
          if (output > balance) {
            System.out.println("출금 가능금액을 초과헀습니다.");
          } else {
            balance -= output;
            System.out.println(output + "원이 출금됐습니다");
          }
          break;
        case 3:
          System.out.println("잔고는 " + balance + "원 입니다.");
          break;
        case 4:
          System.out.println("시스템이 종료됩니다.");
          run = false;
      }
    }
  }
}
