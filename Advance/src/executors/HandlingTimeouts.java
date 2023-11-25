package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeouts {
    public static void main(String[] args) {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            var result2 = future.completeOnTimeout(1, 1, TimeUnit.SECONDS).get(); // default value
            System.out.println(result2);
            var result = future.orTimeout(1, TimeUnit.SECONDS).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
