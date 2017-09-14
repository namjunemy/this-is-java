public class Type {
  public static void main(String[] args) {
    byte byteValue = 10;
    char charValue = 'A';

    int intValue1 = byteValue;
    int intValue2 = charValue;
    System.out.println(intValue1);
    short shortValue = (short) charValue;

    String strValue = "A";

    double var = (double) intValue1;
    System.out.println(var);

    int intValue3 = (int) var;
    System.out.println(intValue3);

    byte b = 10;
    float f = 2.5F;
    double d = 2.5;
    //byte r = b + b;
    byte r = (byte) (b + b);
    int rr = 5 + b;
    float rrr = 5 + f;
    double rrrr = 5 + d;
    System.out.println(r);
    System.out.println(rr);
    System.out.println(rrr);
    System.out.println(rrrr);
  }
}
