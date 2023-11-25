package executors;

import java.util.concurrent.CompletableFuture;

public class ComposingCompletableFuture {

    public static CompletableFuture<String> getEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void main(String[] args) {
        getEmailAsync()
                .thenCompose(ComposingCompletableFuture::getPlaylistAsync)
                .thenAccept(System.out::println);
    }
}
