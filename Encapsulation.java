class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawn(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        acc.withdrawn(3000);
        System.out.println(acc.getBalance());

    }
}
