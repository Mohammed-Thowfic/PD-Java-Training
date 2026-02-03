package threadproject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class BankThreadsDemo {
    public static void main(String[] args) throws Exception {
        BankAccount acc = new BankAccount(6000);

        System.out.println("->  Extend Thread <-");
        UserThread t1 = new UserThread(acc, 2000);
        t1.setName("Thread-A");
        t1.start();
        t1.join();

        System.out.println("\n->  Implement Runnable <-");
        Thread t2 = new Thread(new UserRunnable(acc, 1500), "Runnable-B");
        t2.start();
        t2.join();

        System.out.println("\n->  ExecutorService <-");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new UserExecutor(acc, 1000));
        executor.execute(new UserExecutor(acc, 500));
        executor.shutdown();
        System.out.println(executor.awaitTermination(3, TimeUnit.SECONDS));

        System.out.println("\n->  Callable + Future <-");
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        Future<Boolean> future1 = executor2.submit(new UserCallable(acc, 1000));
        Future<Boolean> future2 = executor2.submit(new UserCallable(acc, 500));
        System.out.println("Callable task success: " + future1.get());
        System.out.println("Callable task success: " + future2.get());
        executor2.shutdown();
    }
}
