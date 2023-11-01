package exceptions.customexceptions;

public class Account {

    private float balance;

    public void withDraw(float amount) throws InsufficientFundsException {
        if(balance < amount)
        throw new InsufficientFundsException("Insufficient funds in your account");
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
