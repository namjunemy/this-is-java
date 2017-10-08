package generic_method.two;

public class CompareMethodEx {
  public static void main(String[] args) {
    Pair<String, Integer> p1 = new Pair<>("김남준", 25);
    Pair<String, Integer> p2 = new Pair<>("김남준", 25);
    Pair<String, Integer> p3 = new Pair<>("namjune", 26);

    System.out.println(Util.compare(p1, p2));
    System.out.println(Util.compare(p2, p3));
    System.out.println(Util.compare(p1, p3));
  }
}