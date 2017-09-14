package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh mm ss");
    System.out.println(sdf.format(now));
  }
}
