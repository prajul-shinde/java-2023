package Concurrency.ThreadSafeStrategies.WaitAndNotifyVolatile;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("downloading a file: " + Thread.currentThread().getName());
        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }
        status.done();
        synchronized (status) {
            status.notifyAll();
        }
        System.out.println("download complete: " + Thread.currentThread().getName());
    }

}
