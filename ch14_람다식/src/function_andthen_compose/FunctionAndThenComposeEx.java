package function_andthen_compose;

import consumer_andthen_compose.Address;
import consumer_andthen_compose.Member;

import java.util.function.Function;

public class FunctionAndThenComposeEx {
  public static void main(String[] args) {
    Function<Member, Address> functionA;
    Function<Address, String> functionB;
    Function<Member, String> functionAB;

    functionA = member -> member.getAddress();
    functionB = address -> address.getCity();

    functionAB = functionA.andThen(functionB);
    String city = functionAB.apply(
        new Member("김남준", "njkim", new Address("한국", "서울"))
    );
    System.out.println("andThen 거주도시: " + city);

    functionAB = functionB.compose(functionA);
    city = functionAB.apply(
        new Member("김남준", "njkim", new Address("한국", "서울"))
    );
    System.out.println("compose 거주도시: " + city);
  }
}
