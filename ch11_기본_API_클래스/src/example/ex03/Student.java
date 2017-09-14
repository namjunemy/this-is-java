package example.ex03;

public class Student {
  private String studentNum;

  public Student(String studentNum) {
    this.studentNum = studentNum;
  }

  public String getStudentNum() {
    return studentNum;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Student) {
      Student student = (Student) object;
      if(studentNum.equals(student.getStudentNum())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return studentNum.hashCode();
  }
}
