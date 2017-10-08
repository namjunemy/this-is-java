package bounded_type_parameter;

public class BoundedTypeParameterEx {
  public static void main(String[] args) {
    int result1 = Util.compare(8, 4);
    System.out.println(result1);

    result1 = Util.compare(3, 8);
    System.out.println(result1);
  }
}
