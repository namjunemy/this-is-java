package generic_type;

public class BoxEx {
  public static void main(String[] args) {
    Box<String> box = new Box<>();

    box.set("namjune");

    String name = box.get();

    System.out.println(name);
  }
}
