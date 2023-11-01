package exceptions.customexceptions;

public class Account {

    private float balance;

    // public void withDraw(float amount) throws InsufficientFundsException {
    //     if(balance < amount)
    //     throw new InsufficientFundsException("Insufficient funds in your account");
    // }

     public void withDraw(float amount) throws AccountException {
        if(balance < amount)
        throw new AccountException(new InsufficientFundsException());
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
