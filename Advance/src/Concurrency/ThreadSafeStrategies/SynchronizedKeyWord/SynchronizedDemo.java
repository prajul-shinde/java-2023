package Concurrency.ThreadSafeStrategies.SynchronizedKeyWord;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedDemo {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        DownloadStatus status = new DownloadStatus();
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
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

        System.out.println("[download bytes Status: " + status.getTotalBytes() + ", download files status: "
                + status.getTotalFiles() + "]");
    }
}
