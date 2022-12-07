package task39sda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CW39 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Display(1));
        executorService.execute(new Display(2));

        for(int i =0; i<10; i++)
            executorService.execute(new Sensor());


    }
}
