package object;

public class EqualsEx {
  public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();

    boolean result = obj1.equals(obj1);
    System.out.println(result);

    boolean result2 = (obj1 == obj2);
    System.out.println(result2);
  }
}
