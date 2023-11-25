package executors.project;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import executors.LongTask;

public class FlightService {

    public static CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("getting quote from " + site);
            var random = new Random();
            LongTask.simulate(1_000 + random.nextInt(2_000));
            var price = 100 + random.nextInt(10);
            return new Quote(site, price);
        });
    }

    public static Stream<CompletableFuture<Quote>> getQuotesAsyc() {
        var sites = List.of("site1", "site2", "site3");
        return sites.stream().map(FlightService::getQuoteAsync);
    }

}
