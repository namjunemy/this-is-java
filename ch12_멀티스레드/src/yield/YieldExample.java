package yield;

public class YieldExample {
  public static void main(String[] args) {
    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();

    threadA.start();
    threadB.start();

    try {
      Thread.sleep(500);
    } catch (Exception e) {
    }
    threadA.work = false;

    try {
      Thread.sleep(500);
    } catch (Exception e) {
    }
    threadA.work = true;

    try {
      Thread.sleep(500);
    } catch (Exception e) {
    }
    threadA.stop = true;
    threadB.stop = true;

  }
}
