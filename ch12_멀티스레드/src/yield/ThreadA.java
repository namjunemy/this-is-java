package yield;

public class ThreadA extends Thread {
  public boolean stop = false;
  public boolean work = true;

  public void run() {
    while(!stop) {
      if(work) {
        System.out.println("Thread A 작업중");
      } else {
        Thread.yield();
      }
    }
    System.out.println("Thread A 종료");
  }
}
