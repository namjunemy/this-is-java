package beepthread;

import java.awt.Toolkit;

public class BeepPrintEx {
  public static void main(String[] args) {
    Thread thread = new BeepThread();
    thread.start();

    Thread thread1 = new Thread(() -> {
      Toolkit toolkit = Toolkit.getDefaultToolkit();

      for (int i = 0; i < 5; i++) {
        toolkit.beep();
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
