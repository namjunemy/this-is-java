package non_generic_type;

public class BoxEx {
  public static void main(String[] args) {
    Box box = new Box();

    box.set("namjune");

    String name = (String) box.get();

    System.out.println(name);
  }
}
