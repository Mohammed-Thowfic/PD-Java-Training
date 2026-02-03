package threadproject;

public class UserExecutor implements Runnable{
    BankAccount account;
    int amount;

    UserExecutor(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
