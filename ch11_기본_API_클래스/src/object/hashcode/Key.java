package object.hashcode;

public class Key {
  public int number;

  public Key(int number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Key) {
      Key compareKey = (Key) object;
      if(this.number == compareKey.number) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return number;
  }
}
