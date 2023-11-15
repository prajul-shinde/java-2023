package Concurrency.ThreadSafeStrategies.WaitAndNotifyVolatile;

public class DownloadStatus {

    private int totalBytes;
    private volatile boolean isDone;
    private Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public boolean isDone() {
        return isDone;
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;

        }
    }

    public void done() {
        isDone = true;
    }

}
