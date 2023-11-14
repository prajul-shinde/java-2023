package Concurrency;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for (var i = 0; i < 100; i++) {
            Thread thread = new Thread(new DownloadFIleTaskRaceCondition(status));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("status: "+ status.getTotalBytes());
    }
}
