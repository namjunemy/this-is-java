package string.keyboard_to_string;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardToString {
  public static void main(String[] args) throws IOException {
    byte[] bytes = new byte[100];

    System.out.print("입력 : ");
    int readByteNo = System.in.read(bytes);

    String str = new String(bytes, 0, readByteNo-1);
    System.out.println(str);

    Scanner scanner = new Scanner(System.in);
    System.out.print("입력 : ");
    System.out.println(scanner.next());

  }
}
