package generic_method.one;

public class BoxingMethodEx {
  public static void main(String[] args) {
    Box box1 = Util.boxing(100);
    System.out.println(box1.get());

    Box box2 = Util.boxing("namjune");
    System.out.println(box2.get());

  }
}
