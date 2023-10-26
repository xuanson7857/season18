public class DemoThreadSafe extends Thread{
    private static int count=0;

    public static void main(String[] args) throws InterruptedException{
        Thread thread1=new DemoThreadSafe();
        Thread thread2=new DemoThreadSafe();
        Thread thread3=new DemoThreadSafe();

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("da dem dc " +count);
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000000; i++) {
//            increase();
            increase2();
        }
    }

    private synchronized static void increase() {
            count++;
    }

    private static void increase2(){
        synchronized (DemoThreadSafe.class){
            count++;
        }
    }
}
