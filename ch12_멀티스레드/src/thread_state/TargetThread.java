package thread_state;

public class TargetThread extends Thread {
  public void run() {
    for (long i = 0; i < 2000000000; i++) {

    }

    try {
      Thread.sleep(2000);
    } catch (Exception e) {

    }

    for (long i = 0; i < 2000000000; i++) {

    }
  }
}
