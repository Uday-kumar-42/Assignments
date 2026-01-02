
public class Account implements AccountOperation {
    private double balance;

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}