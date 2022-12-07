package task38;

import java.util.concurrent.atomic.AtomicInteger;

public class WaterTank {
    private static final AtomicInteger LEVEL = new AtomicInteger(0);

    public synchronized void useWater() {
        while (true) {
            while (LEVEL.get() == 0) {
                System.out.println("\tBRAK WODY!");
                try {
                    wait(); //wywołane na THIS (lockiem jest THIS)
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("\tPOZOSTAŁO WODY: " + LEVEL.decrementAndGet());
        }
    }

    public synchronized void addWater(int amount) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Dodano, nowy poziom: " + LEVEL.addAndGet(amount));
        notifyAll(); //wywołane na THIS (lockiem jest THIS)
    }
}
