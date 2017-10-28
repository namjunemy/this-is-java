package minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByEx {
  public static void main(String[] args) {
    BinaryOperator<Fruit> binaryOperator;
    Fruit fruit;

    binaryOperator = BinaryOperator.minBy(
        (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
    fruit = binaryOperator.apply(
        new Fruit("수박", 20000), new Fruit("오렌지", 10000));
    System.out.println("minBy: " + fruit.getName());

    binaryOperator = BinaryOperator.maxBy(
        (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
    fruit = binaryOperator.apply(
        new Fruit("수박", 20000), new Fruit("오렌지", 10000));
    System.out.println("maxBy: " + fruit.getName());
  }
}
