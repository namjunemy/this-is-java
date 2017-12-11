package list.ex2_vector;

import java.util.List;
import java.util.Vector;

public class VectorEx {
  public static void main(String[] args) {
    List<Board> list = new Vector<>();

    list.add(new Board("제목1", "내용1", "작성자1"));
    list.add(new Board("제목2", "내용2", "작성자2"));
    list.add(new Board("제목3", "내용3", "작성자3"));
    list.add(new Board("제목4", "내용4", "작성자4"));
    list.add(new Board("제목5", "내용5", "작성자5"));

    list.remove(2);
    list.remove(3);

    list.forEach(board -> System.out.println(board));
  }
}
