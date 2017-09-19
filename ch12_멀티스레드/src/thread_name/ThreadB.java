package thread_name;

public class ThreadB extends Thread {
  public ThreadB() {
    //this.setName("ThreadB");
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(this.getName());
    }
  }
}
