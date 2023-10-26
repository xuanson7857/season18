package bai3;

class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        long num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("OptimizedPrimeFactorization found prime: " + num);
            }
            num++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}