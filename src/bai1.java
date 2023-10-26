public class bai1 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new bai1());
        thread.start();
        thread.join();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
