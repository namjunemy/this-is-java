package thread_group.interrupt;

public class ThreadGroupEx {
  public static void main(String[] args) {
    ThreadGroup myGroup = new ThreadGroup("myGroup");
    WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
    WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

    workThreadA.start();
    workThreadB.start();

    System.out.println("[메인 스레드 그룹의 list() 메소드 출력 내용]");
    ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
    mainGroup.list();
    System.out.println();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {

    }

    System.out.println("[myGroup의 interrupt() 메소드 호출]");
    myGroup.interrupt();
  }
}
