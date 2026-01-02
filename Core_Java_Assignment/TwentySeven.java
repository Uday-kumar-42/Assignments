public class TwentySeven {
    public static void main(String[] args) {
        // account class defined in Account.java file
        Account acc = new Account();
        acc.deposit(1000);
        System.out.println("Balance = " + acc.getBalance());
    }
}
