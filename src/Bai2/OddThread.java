package Bai2;

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(10); // Ngủ 10 mili giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}