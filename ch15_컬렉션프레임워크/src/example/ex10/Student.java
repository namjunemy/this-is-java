package example.ex10;

public class Student implements Comparable<Student>{
  private String id;
  private int score;

  public Student(String id, int score) {
    this.id = id;
    this.score = score;
  }

  public String getId() {
    return id;
  }

  public int getScore() {
    return score;
  }

  @Override
  public int compareTo(Student o) {
    if(score < o.getScore()) return -1;
    else if (score == o.getScore()) return 0;
    else return 1;
  }
}
