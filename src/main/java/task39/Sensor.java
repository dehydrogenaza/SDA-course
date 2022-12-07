package task39;

import java.util.Random;

public class Sensor implements Runnable {
    private final Results results;

    public Sensor(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        Random rng = new Random();

        for (int i = 0; i < 10; i++) {
            int oldA = results.getScoreA();
            int oldB = results.getScoreB();

            try {
//                Thread.sleep(rng.nextInt(1500));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int newA = oldA + rng.nextInt(10);
            int newB = oldB + rng.nextInt(10);

            String wasUpdatedSubstring = results.updateScores(newA, newB, oldA, oldB)
                    ? "ZMIENIŁ WYNIK -> " + newA + " / " + newB
                    : "nieaktualny";
            System.out.println("\t"
                    + Thread.currentThread().getName()
                    + "... "
                    + wasUpdatedSubstring);
        }
    }
}
