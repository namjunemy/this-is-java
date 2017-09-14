public class Ex05 {
  /**
   * 05. 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?
   *
   *    public void method1() throws NumberFormatExceptions, ClassNotFoundException {...}
   *
   * 1. try {method1();} catch (Exception e) {}
   * 2. void method2() throws Exception {method1();}
   * 3. try {method1();} catch (Exception e) {} catch (ClassNotFoundException) {}\
   *    (method1이 던진 두가지의 예외가 아닌, 다른 예외도 모두 첫번째 catch문 에서 최상위 클래스인 Exception에서
   *     처리되기 때문에 올바른 예외처리 방법이 아니다.)
   * 4. try {method1();} catch (ClassNotFoundException e) {} catch (NumberFormatException e) {}
   */
}
