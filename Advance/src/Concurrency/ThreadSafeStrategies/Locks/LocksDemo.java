package Concurrency.ThreadSafeStrategies.Locks;

import java.util.ArrayList;
import java.util.List;

public class LocksDemo {

    public static void main(String[] args) {
        var status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
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

        System.out.println("TotalBytes: " + status.getTotalBytes());
    }

}
