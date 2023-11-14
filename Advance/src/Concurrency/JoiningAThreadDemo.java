package Concurrency;

public class JoiningAThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Scanning file for viruses...");
        }
    }

}
