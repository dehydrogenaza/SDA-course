package task34;

public class Client34 {
    public static void main(String[] args) {

        Thread[] testThreads = new Thread[10];
        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i] = new MyThread();
            testThreads[i].start();
        }
    }
}
