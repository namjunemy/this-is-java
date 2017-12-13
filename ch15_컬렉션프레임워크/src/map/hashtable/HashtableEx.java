package map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();

    map.put("spring", "12");
    map.put("summer", "123");
    map.put("fall", "1234");
    map.put("winter","12345");

    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.println("아이디와 비밀번호를 입력해주세요.");
      System.out.print("아이디 :");
      String id = scanner.nextLine();
      System.out.print("비밀번호 :");
      String pw = scanner.nextLine();
      System.out.println();
      if(map.containsKey(id)) {
        if(map.get(id).equals(pw)) {
          System.out.println("로그인 되었습니다.");
        } else {
          System.out.println("비밀번호가 맞지 않습니다.");
        }
      } else {
        System.out.println("아이디가 존재하지 않습니다.");
      }
    }
  }
}
