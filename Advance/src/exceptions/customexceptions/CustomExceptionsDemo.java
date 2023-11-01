package exceptions.customexceptions;

public class CustomExceptionsDemo {
    public static void main(String[] args) {
        var account = new Account();
        try {
            account.withDraw(10F);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
