package threadproject;

public class UserThread extends Thread{
    BankAccount account;
    int amount;

    UserThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
