package Concurrency.ThreadSafeStrategies.WaitAndNotifyVolatile;

public class WaitAndNotifyDemo {

    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        var thread = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("totalBytes: " + status.getTotalBytes());
        });

        thread.start();
        thread2.start();
    }

}
