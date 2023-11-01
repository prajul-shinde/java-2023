package exceptions.customexceptions;

public class CustomExceptionsDemo {
    public static void main(String[] args) {
        var account = new Account();
        try {
            account.withDraw(10F);
        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
