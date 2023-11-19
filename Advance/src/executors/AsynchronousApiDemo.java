package executors;

public class AsynchronousApiDemo {
    public static void main(String[] args) {
        var service = new MailService();

        // synchronous untill it gets output it doesnt execute hello world
        service.send();
        System.out.println("Hello world");

        // asynchronous prints sout first
        service.sendAsync();

        System.out.println("hello world again");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
