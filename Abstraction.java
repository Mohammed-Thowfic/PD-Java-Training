abstract class ATM {
    abstract void withdraw();

    void balance() {
        System.out.println("My Balance is 1000");
    }
}

class MyATM extends ATM {
    public void withdraw() {
        System.out.println("Money is Withdraw successfully");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        ATM e = new MyATM();
        e.withdraw();
        e.balance();
    }
}
