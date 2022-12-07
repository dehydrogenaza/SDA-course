package task36_37;

public class ThreadPlaygroundRunnable implements Runnable {
    private final String name;
    private final static int REPETITIONS = 10;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < REPETITIONS; i++) {
            System.out.println(Thread.currentThread().getName()
            + ": "
            + name.toUpperCase()
            + "(iter "
            + i
            + ")");
        }
    }
}
