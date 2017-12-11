package list.ex2_vector;

public class Board {
  private String subject;
  private String content;
  private String writer;

  public Board(String subject, String content, String writer) {
    this.subject = subject;
    this.content = content;
    this.writer = writer;
  }

  @Override
  public String toString() {
    return subject + " " + content + " " + writer;
  }
}
