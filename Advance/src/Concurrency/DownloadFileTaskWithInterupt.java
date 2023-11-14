package Concurrency;

public class DownloadFileTaskWithInterupt implements Runnable {

    @Override
    public void run() {
        System.out.println("downloading file: " + Thread.currentThread().getName());

        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("interupting thread " + Thread.currentThread().getName());
                return;
            }
            System.out.println("donwloadind a byte " + i);
        }
        System.out.println("download complete");
    }

}
