package string;

public class StringBuilderEx {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    sb.append("Java ");
    sb.append("Programming Study");
    System.out.println(sb.toString());

    sb.insert(4, "2");
    System.out.println(sb.toString());

    sb.setCharAt(4, '8');
    System.out.println(sb.toString());

    sb.replace(6, 17, "Book");
    System.out.println(sb.toString());

    sb.delete(4,5);
    System.out.println(sb.toString());

    int length = sb.length();
    System.out.println(length);

    String result = sb.toString();
    System.out.println(result);
  }
}
