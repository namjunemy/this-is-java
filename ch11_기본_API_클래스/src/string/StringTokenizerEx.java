package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
  public static void main(String[] args) {
    String text = "김남준/김태균/이용규/정근우";

    StringTokenizer st = new StringTokenizer(text,"/");
    int countTokens = st.countTokens();

    for(int i=0;i<countTokens;i++) {
      String token = st.nextToken();
      System.out.println(token);
    }

    System.out.println();

    st = new StringTokenizer(text,"/");
    while(st.hasMoreTokens()) {
      String token = st.nextToken();
      System.out.println(token);
    }
  }
}
