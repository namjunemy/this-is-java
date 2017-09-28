package callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackEx {
  private ExecutorService executorService;
  private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
    @Override
    public void completed(Integer result, Void attachment) {
      System.out.println("completed 실행 " + result);
    }

    @Override
    public void failed(Throwable exc, Void attachment) {
      System.out.println("failed 실행 " + exc.toString());
    }
  };

  public CallbackEx() {
    executorService = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors()
    );
  }

  public void doWork(String x, String y) {
    Runnable task = () -> {
      try {
        int intX = Integer.parseInt(x);
        int intY = Integer.parseInt(y);
        int result = intX + intY;
        callback.completed(result, null);
      } catch (NumberFormatException e) {
        callback.failed(e, null);
      }
    };

    executorService.submit(task);
  }

  public void finish() {
    executorService.shutdown();
  }

  public static void main(String[] args) {
    CallbackEx callbackEx = new CallbackEx();

    callbackEx.doWork("3", "4");
    callbackEx.doWork("3", "사");

    callbackEx.finish();
  }
}
