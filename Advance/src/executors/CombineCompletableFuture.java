package executors;

import java.util.concurrent.CompletableFuture;

public class CombineCompletableFuture {
    public static void main(String[] args) {
        var first = CompletableFuture.supplyAsync(() -> "20USD")
                .thenApply((str) -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });
        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);
    }
}
