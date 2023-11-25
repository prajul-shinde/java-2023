package executors;

import java.util.concurrent.CompletableFuture;

public class TransFormingCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 20).thenApply(TransFormingCompletableFuture::toFarenheit)
                .thenAccept(System.out::println);
    }

    public static int toFarenheit(int celcius) {
        return (int) (celcius * 1.8) + 32;
    }
}
