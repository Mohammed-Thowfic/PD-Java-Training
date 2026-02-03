package threadproject;

public class UserRunnable implements Runnable{
    BankAccount account;
    int amount;

    UserRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
