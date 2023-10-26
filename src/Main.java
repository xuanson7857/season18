public class Main extends Thread{
    public static void main(String[] args) {
        Thread thread=new Thread();
        Thread thread1=new Thread(new RunnavleImpl("runtbale target"));
       thread1.start();
        System.out.println("ket thuc chuong trinhf");
    }

    @Override
    public void run() {
        for (int j = 0; j < 20; j++) {
            System.out.println(j+1);
        }
    }
}