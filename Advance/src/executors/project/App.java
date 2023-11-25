package executors.project;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        var start = LocalTime.now();

        FlightService.getQuoteAsync("site1").thenAccept(System.out::println);

        var futures = FlightService.getQuotesAsyc().map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).thenRun(() -> {
            var end = LocalTime.now();
            Duration timeTaken = Duration.between(start, end);
            System.out.println("Retrived all quotes in: " + timeTaken.toMillis() + " msec");
        });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
