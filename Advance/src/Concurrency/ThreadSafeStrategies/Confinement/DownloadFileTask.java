package Concurrency.ThreadSafeStrategies.Confinement;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;
    

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }


    @Override
    public void run() {

        for(var i =0 ; i<10_000;i++){
            if(Thread.currentThread().isInterrupted())return;
            status.increamentBytes();
        }
        System.out.println("file download complete "+ Thread.currentThread().getName());
    }


    public DownloadStatus getStatus() {
        return status;
    }

}
