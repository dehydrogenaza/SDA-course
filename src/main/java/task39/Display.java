package task39;

import java.util.Random;

public class Display implements Runnable {
    private final Results results;

    public Display(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        Random rng = new Random();

        for (int i = 0; i < 10; i++) {
            try {
//                Thread.sleep(rng.nextInt(2000));
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(results);
        }
    }
}
