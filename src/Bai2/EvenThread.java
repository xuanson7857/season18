package Bai2;

class EvenThread extends Thread {
    private Thread oddThread;

    public EvenThread(Thread oddThread) {
        this.oddThread = oddThread;
    }

    @Override
    public void run() {
        try {
            oddThread.join(); // Đợi thread lẻ kết thúc trước
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(15); // Ngủ 15 mili giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}