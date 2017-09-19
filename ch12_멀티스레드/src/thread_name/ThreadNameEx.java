package thread_name;

public class ThreadNameEx {
  public static void main(String[] args) {
    Thread thread = Thread.currentThread();
    System.out.println(thread.getName());

    Thread threadA = new ThreadA();
    threadA.start();

    Thread threadB = new ThreadB();
    threadB.start();
  }
}
