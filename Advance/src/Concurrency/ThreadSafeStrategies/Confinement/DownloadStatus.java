package Concurrency.ThreadSafeStrategies.Confinement;

public class DownloadStatus {

    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increamentBytes() {
        totalBytes++;
    }

}
