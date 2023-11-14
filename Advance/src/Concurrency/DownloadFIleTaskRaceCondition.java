package Concurrency;

public class DownloadFIleTaskRaceCondition implements Runnable {

    private DownloadStatus status;

    public DownloadFIleTaskRaceCondition(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        for (var i = 0; i <= 10_000; i++) {
            status.incrementBytes();
        }
        System.out.println("download complete "+Thread.currentThread().getName());
    }

}
