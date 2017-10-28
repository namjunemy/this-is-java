package predicate;

public class Student {
  private String name;
  private String sex;
  private int score;

  public Student(String name, String sex, int score) {
    this.name = name;
    this.sex = sex;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public String getSex() {
    return sex;
  }

  public int getScore() {
    return score;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
