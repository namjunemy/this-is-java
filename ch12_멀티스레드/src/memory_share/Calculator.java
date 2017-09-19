package memory_share;

public class Calculator {
  private int memory;

  public int getMemory() {
    return memory;
  }

  public void setMemory(int memory) {
    synchronized(this) {
      this.memory = memory;
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
      }
      System.out.println(Thread.currentThread().getName() + ": " + this.memory);


      StringBuffer sb= new StringBuffer();
      sb.append("22");
      System.out.println(sb.toString());
    }
  }
}
