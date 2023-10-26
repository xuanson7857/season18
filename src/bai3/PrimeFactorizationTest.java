package bai3;

import java.util.concurrent.TimeUnit;

public class PrimeFactorizationTest {
    public static void main(String[] args) {
        Runnable lazyPrimeFactorization = new LazyPrimeFactorization();
        Runnable optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);

        lazyThread.start();
        optimizedThread.start();

        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lazyThread.interrupt();
        optimizedThread.interrupt();
    }
}