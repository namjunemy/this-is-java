package generic_extends_implements;

public class ChildProduct<K,M, C> extends Product<K,M> {
  private C company;

  public C getCompany() {
    return company;
  }

  public void setCompany(C company) {
    this.company = company;
  }
}
