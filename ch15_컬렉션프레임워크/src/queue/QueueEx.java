package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<>();

    messageQueue.offer(new Message("send Email", "홍길동"));
    messageQueue.offer(new Message("send SMS", "신용권"));
    messageQueue.offer(new Message("send Kakaotalk", "김남준"));

    while(!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch(message.getCommand()) {
        case "send Email":
          System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
          break;
        case "send SMS":
          System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
          break;
        case "send Kakaotalk":
          System.out.println(message.getTo() + "님에게 KakaoTalk 보냅니다.");
          break;
      }
    }
  }
}
