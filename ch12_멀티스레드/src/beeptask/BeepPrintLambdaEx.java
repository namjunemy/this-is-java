package beeptask;

import java.awt.*;

public class BeepPrintLambdaEx {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for (int i = 0; i < 5; i++) {
        toolkit.beep();
        System.out.println("빞");
        try {
          Thread.sleep(500);
        } catch (Exception e) {
        }
      }
    });
    thread.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }
}
