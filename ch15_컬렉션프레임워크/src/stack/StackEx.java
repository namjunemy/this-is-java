package stack;

import java.util.Stack;

public class StackEx {
  public static void main(String[] args) {
    Stack<Coin> coinBox = new Stack<>();

    coinBox.push(new Coin(100));
    coinBox.push(new Coin(500));
    coinBox.push(new Coin(50));

    while(!coinBox.isEmpty()) {
      System.out.println("꺼낸 동전 : " + coinBox.pop().getValue() + "원");
    }
  }
}
