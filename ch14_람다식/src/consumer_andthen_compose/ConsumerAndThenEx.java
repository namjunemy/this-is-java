package consumer_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenEx {
  public static void main(String[] args) {
    Consumer<Member> consumerA = (member) -> {
      System.out.println(member.getName());
    };
    Consumer<Member> consumerB = (member) -> {
      System.out.println(member.getId());
    };

    Consumer<Member> consumerAB = consumerA.andThen(consumerB);
    consumerAB.accept(
        new Member("김남준", "njkim", new Address("korea", "seoul"))
    );
  }
}
