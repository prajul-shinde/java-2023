package Concurrency.ThreadSafeStrategies.Locks;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementBytes();
        }
        System.out.println("download file complete: " + Thread.currentThread().getName());

    }

    public DownloadStatus getStatus() {
        return status;
    }

}
