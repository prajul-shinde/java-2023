package executors;

import java.util.concurrent.CompletableFuture;

public class WaitingForFirstTask {

    public static void main(String[] args) {
        var slow = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var fast = CompletableFuture.supplyAsync(() -> {
            return 20;
        });

        CompletableFuture.anyOf(slow, fast).thenAccept(System.out::println);
    }
}
