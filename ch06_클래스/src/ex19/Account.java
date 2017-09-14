package ex19;

public class Account {
  private int balance;

  public Account() {
  }

  public void setBalance(int balance) {
    if (0 <= balance && balance <= 1000000) {
      this.balance = balance;
    }
  }

  public int getBalance() {
    return balance;
  }
}
