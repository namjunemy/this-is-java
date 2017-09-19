package thread_name;

public class ThreadA extends Thread {
  public ThreadA() {
    this.setName("ThreadA");
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(this.getName());
    }
  }
}
