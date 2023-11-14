package Concurrency.ThreadSafeStrategies.Confinement;

import java.util.ArrayList;
import java.util.List;

public class ConfineMentDemo {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
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

        var totalBytes = tasks.stream()
                .map(task -> task.getStatus().getTotalBytes())
                .reduce(Integer::sum);

        System.out.println("totalBytes: " + totalBytes);

    }

}
