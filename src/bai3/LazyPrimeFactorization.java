package bai3;

class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        long num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("LazyPrimeFactorization found prime: " + num);
            }
            num++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 1) return false;
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}