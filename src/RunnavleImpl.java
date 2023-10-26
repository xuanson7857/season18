public class RunnavleImpl implements Runnable{
    private String name;

    public RunnavleImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(name +":" +i+1);
        }
    }
}
