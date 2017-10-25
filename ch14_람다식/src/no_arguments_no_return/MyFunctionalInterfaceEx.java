package no_arguments_no_return;

public class MyFunctionalInterfaceEx {
  public static void main(String[] args) {
    MyFunctionalInterface fi = () -> {
      String str = "method call 1";
      System.out.println(str);
    };
    fi.method();

    fi = () -> System.out.println("method call 2");
    fi.method();

    fi = new MyFunctionalInterface() {
      @Override
      public void method() {
        System.out.println("method call 3");
      }
    };
    fi.method();
  }
}
