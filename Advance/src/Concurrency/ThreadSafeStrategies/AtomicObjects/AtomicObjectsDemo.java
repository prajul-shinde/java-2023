package Concurrency.ThreadSafeStrategies.AtomicObjects;

import java.util.ArrayList;
import java.util.List;

public class AtomicObjectsDemo {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("totalBytes: " + status.getTotalBytes());
    }
}
