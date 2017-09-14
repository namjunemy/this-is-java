package string;

public class StringEqualsEx {
  public static void main(String[] args) {
    String str1 = "김남준";
    String str2 = "김남준";

    if (str1 == str2) {
      System.out.println("같은 String 객체를 참조");
    } else {
      System.out.println("다른 Srting 객체를 참조");
    }

    if (str1.equals(str2)) {
      System.out.println("같은 문자열을 가짐");
    } else {
      System.out.println("다른 문자열을 가짐");
    }
  }
}
