package example;

public class Ex11 {
  /**
   * 11. while문으로 반복적인 작업을 하는 스레드를 종료시키는 방법에 대한 설명 중 최선의 방법이 아닌 것은?
   *
   * 1. stop() 메소드를 호출해서 즉시 종료시킨다.
   * 2. 조건식에 boolean 타입의 stop 플래그를 이용해서 while 문을 빠져나가게 한다.
   * 3. 스레드가 반복적으로 일시 정지 상태가 된다면 InterruptedException을 발생시켜 예외 처리 코드에서 break문으로 while문을 빠져나가게 한다.
   * 4. 스레드가 일시 정지 상태로 가지 않는다면 isInterrupted() 나 interrupted() 메소드의 리턴값을 조사해서 true일 경우 break문으로 while문을 빠져나가게 한다.
   *
   * 1 -> stop() 메소드는 스레드의 불안정한 종료를 유발할 수 있으므로 사용하지 않는 것이 좋다.
   */
}
