public class BankAccount {
    private double balance = 5000;

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be greater than 0");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }
}