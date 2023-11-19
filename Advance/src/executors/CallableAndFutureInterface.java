package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CallableAndFutureInterface {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);

        try {
            // accepts callable: task that returns value
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("some other work");

            var result = future.get(); // blocks current thread till result is ready
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            ;
        }
    }
}
