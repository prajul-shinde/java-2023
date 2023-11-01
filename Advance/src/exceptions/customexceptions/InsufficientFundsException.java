package exceptions.customexceptions;

// if its 
// compile time: (checked) extend Exception class
// runtime (unchecked): extend runtimeException class
public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(){
        super("insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}
