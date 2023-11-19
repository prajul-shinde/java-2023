package executors;

import java.util.concurrent.CompletableFuture;

// demo of thenRun method
public class RunningCodeOnCompletionDemo {
    public static void main(String[] args) {

        // sometimes we need to execute code when async operatioon completes eg store
        // data in db r display result
        // thenRun and thenRunAsync 2 methods are there
        var future = CompletableFuture.supplyAsync(() -> 1);

        future.thenRunAsync(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println("done");

        // get result of completable future

        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
