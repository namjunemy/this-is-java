public class Ex05 {
  /**
   * 05. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데,
   *     Child 클래스의 생성자에서 컴파일 에러가 발생했습니다. 그 이유를 설명해 보세요.
   *
   * public class Parent {
   *   public String name;
   *
   *   public Parent(String name) {
   *     this.name = name;
   *   }
   * }
   *
   * public class Child extends Parent {
   *   private int studentNo;
   *
   *   public Child(String name, int studentNo) {
   *     this.name = name;
   *     this.studentNo = studentNo;
   *   }
   * }
   *
   * --> 자식클래스의 생성자에서 부모클래스 생성자의 호출이 생략됐다.(매개변수 name을 포함한 생성자.)
   *     또, 자식클래스에서 명시적으로 부모클래스의 생성자를 호출하지 않고 사용하려는 의도였다면
   *     부모클래스에서 default 생성자가 존재해야한다. 위의 문제에서는 존재하지 않으므로 컴파일 오류가 난다.
   */
}
