package threadproject;

import java.util.concurrent.Callable;

public class UserCallable implements Callable<Boolean> {
    BankAccount account;
    int amount;

    UserCallable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public Boolean call() {
        return account.withdraw(amount);
    }
}
