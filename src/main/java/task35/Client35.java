package task35;

public class Client35 {
    public static void main(String[] args) {
        int numOfThreads = 10;

        MyRunnable[] runnables = new MyRunnable[numOfThreads];
        Thread[] threads = new Thread[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            runnables[i] = new MyRunnable();
            threads[i] = new Thread(runnables[i]);

            threads[i].start();
        }
    }
}
