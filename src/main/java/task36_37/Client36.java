package task36_37;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client36 {
    public static void main(String[] args) {
        int numOfThreads = 10;
        int threadPoolSize = 3;

//        useThreadsDirectly(numOfThreads);
        useExecutor(numOfThreads, threadPoolSize);
    }

    private static void useExecutor(int numOfThreads, int threadPoolSize) {
        Executor executor = Executors.newFixedThreadPool(threadPoolSize);

        for (int i = 0; i < numOfThreads; i++) {
            executor.execute(new ThreadPlaygroundRunnable("Wątek " + (char) (i + 65)));
        }
    }

    private static void useThreadsDirectly(int numOfThreads) {
        Thread[] threads = new Thread[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            threads[i] = new Thread(new ThreadPlaygroundRunnable("Wątek " + (char) (i + 65)));

            threads[i].start();
        }
    }
}
