package ex13;

/**
 *
 * 13. 현실 세계의 회원을 Member 클래스로 모델링 하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다.
 * 이 데이터들을 가지는 Member 클래스를 선언해 보세요.
 */
public class Member {
  private String name;
  private String id;
  private String password;
  private int age;

  public Member(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public String getId() {
    return this.id;
  }

  public String getPassword() {
    return this.password;
  }

  public int getAge() {
    return this.age;
  }
}
