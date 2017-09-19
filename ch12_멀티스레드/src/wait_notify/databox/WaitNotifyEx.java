package wait_notify.databox;

public class WaitNotifyEx {
  public static void main(String[] args) {
    DataBox dataBox = new DataBox();

    ProducerThread producerThread = new ProducerThread(dataBox);
    ConsumerThread consumerThread = new ConsumerThread(dataBox);

    consumerThread.start();
    producerThread.start();
  }
}
