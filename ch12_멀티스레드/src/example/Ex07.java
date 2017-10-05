package example;

public class Ex07 {
  /**
   * 07. interrupt() 메소드를 호출한 효과에 대한 설명 중 틀린 것은 무엇입니까?
   *
   * 1. 일시 정지 상태에서 InterruptedException을 발생시킨다.
   * 2. 스레드는 즉시 종료한다.
   * 3. 실행 대기 상태에서 호출되면 일시 정지 상태가 될 때까지 InterruptedException이 발생하지 않는다.
   * 4. 아직 InterruptException이 발생하지 않았다면 interrupted(), isInterrupt() 메소드는 true를 리턴한다.
   *
   * 2 -> 스레드를 즉시 종료하는 것은 stop()메소드이다. 그러나 스레드의 안정성을 위해 사용하지 않을 것을 권장한다.
   */
}
