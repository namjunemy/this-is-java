public class Ex07 {
  /**
   * 07. Tire 클래스를 상속받아 SnowTire 클래스를 다음과 같이 작성했습니다.
   *     SnowTireExample 클래스를 실행했을 때 출력 결과는 무엇일까요?
   *
   * public class Tire {
   *   public void run() {
   *     System.out.println("일반 타이어가 굴러갑니다.");
   *   }
   * }
   *
   * public class SnowTire extends Tire {
   *   @Override
   *   public void run() {
   *     System.out.println("스노우 타이어가 굴러갑니다.");
   *   }
   * }
   *
   * public class SnowTireEx {
   *   public static void main(String[] args) {
   *     SnowTire snowTire = new SnowTire();
   *     Tire tire = snowTire;
   *
   *     snowTire.run();
   *     tire.run();
   *   }
   * }
   *
   * --> 스노우 타이어가 굴러갑니다. (원래 SnowTire 객채의 메소드)
   *     스노우 타이어가 굴러갑니다. (부모객체 타입에 자식객체를 대입함. 자동타입변환. 따라서, 오버라이딩된 메소드가 호출됨.)
   **/
}
