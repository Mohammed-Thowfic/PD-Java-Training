package threadproject;

public class BankAccount {
    private int balance;
    BankAccount(int balance){
        this.balance=balance;
    }

    synchronized boolean withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " entered withdraw()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
            System.out.println(Thread.currentThread().getName() + " exited withdraw()");
            return true;
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
            return false;
        }
    }
}
