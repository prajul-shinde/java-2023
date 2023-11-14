package Concurrency;

public class InteruptingThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t = new Thread(new DownloadFileTaskWithInterupt());
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
