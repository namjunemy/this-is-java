package runnable;

public class RunnableEx {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.print(i + 1 + " ");
      }
      System.out.println();
    };
    Thread thread1 = new Thread(runnable);
    thread1.start();

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.print(i + 1 + " ");
      }
      System.out.println();
    });
    thread2.start();
  }
}
