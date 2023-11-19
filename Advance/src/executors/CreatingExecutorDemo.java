package executors;

import java.util.concurrent.Executors;

public class CreatingExecutorDemo {

    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);

        try {
            executor.submit(() -> System.out.println(Thread.currentThread().getName()));
        } finally {
            executor.shutdown();
        }
    }
}
