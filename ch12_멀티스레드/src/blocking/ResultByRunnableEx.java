package blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableEx {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors()
    );

    System.out.println("[작업 처리 요청]");
    class Task implements Runnable {
      private Result result;

      Task(Result result) {
        this.result = result;
      }

      @Override
      public void run() {
        for (int i = 1; i <= 10; i++) {
          result.addValue(i);
        }
      }
    }

    Result result = new Result();
    Runnable task1 = new Task(result);
    Runnable task2 = new Task(result);

    Future<Result> future1 = executorService.submit(task1, result);
    Future<Result> future2 = executorService.submit(task2, result);

    try {
      result = future1.get();
      result = future2.get();
      System.out.println("[처리 결과] " + result.getAccumValue());
      System.out.println("[작업 처리 완료]");
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("[실행 예외 발생] " + e.getMessage());
    }

    executorService.shutdown();
  }
}

class Result {
  private int accumValue = 0;

  synchronized void addValue(int value) {
    accumValue += value;
  }

  public int getAccumValue() {
    return accumValue;
  }
}