package example.ex11;

public class Ex11 {
  /**
   * 11. 숫자 100과 300으로 각각 박싱된 Integer객체를 == 연산자로 비교했습니다. 100을 박싱한 Integer 객체는 true가
   *     나오는데, 300을 박싱한 Integer 객체는 false가 나오는 이유를 설명해보세요.
   *
   * => Wrapper Class인 Integer Class는 -128 ~ 127 사이의 숫자는 ==으로 내부의 값응ㄹ 비교할 수 있다.
   *    따라서 100은 범위안에 해당하므로 비교가 가능해서 true값을 반환한다.
   *    Integer의 경우 -128 ~ 127 의 범위를 넘는 숫자는 ==으로 비교할 수 없고,
   *    포장 클래스의 내부 값을 비교하도록 오버라이딩 된 equals() 메소드로 비교해야 한다.
   *
   */
  public static void main(String[] args) {
    Integer obj1 = 100;
    Integer obj2 = 100;
    Integer obj3 = 300;
    Integer obj4 = 300;

    System.out.println(obj1 == obj2);
    System.out.println(obj3 == obj4);
    System.out.println(obj3.equals(obj4));
  }


}
