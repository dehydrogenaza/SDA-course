package task39sda;

import java.util.Random;

public class Sensor implements Runnable {
    @Override
    public void run() {
        ResultsManagement resultsManagement = new ResultsManagement();
        Random random = new Random();

        while (true) {
            Double actualValue = resultsManagement.getResult();

            try {
                //Thread.sleep(random.nextInt(3000));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //Double newValue = actualValue * (random.nextDouble());
            Double newValue = actualValue - random.nextDouble();

            resultsManagement.updateResult(actualValue, newValue);
        }
    }
}