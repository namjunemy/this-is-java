package ex17;

/**
 *
 * 17. 16번 문제에서는 Printer 객체를 생성하고 println() 메소드를 생성했습니다.
 * Printer 객체를 생성하지 않고 PrinterEx 클래스에서 다음과 같이 호출 하려면 Printer 클래스를 어떻게 수정하면 될까요?
 * */
public class PrinterEx {
  public static void main(String[] args) {
    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");
  }
}
