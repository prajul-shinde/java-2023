package executors;

import java.util.concurrent.CompletableFuture;

public class HandlingExceptions {
    public static void main(String[] args) {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("getting current weather");
            throw new IllegalArgumentException();
        });

        try {
            var temperature = future.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
