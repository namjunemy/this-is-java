package arguments;

public class MyFunctionalInterfaceEx {
  public static void main(String[] args) {
    MyFunctionalInterface fi = (x) -> {
      int result = x * 5;
      System.out.println(result);
    };
    fi.method(3);

    fi = x -> System.out.println(x * 5);
    fi.method(4);


  }
}
