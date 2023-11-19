package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("a");
        // for task that doesnt return value use runAsync
        var future = CompletableFuture.runAsync(task);

        Supplier<Integer> supplier = () -> 1;
        // if task should return value use supplyAsync
        var futureSupply = CompletableFuture.supplyAsync(supplier);

        try {
            Integer result = futureSupply.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
