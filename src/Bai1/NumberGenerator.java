package Bai1;

public class NumberGenerator implements Runnable {
    private static final int COUNT = 10;

    @Override
    public void run() {
        for (int i = 1; i <= COUNT; i++) {
            System.out.println("Number: " + i + ", Thread ID: " + Thread.currentThread().getId() +
                    ", HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Thay đổi priority của các thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
