package task38sda;

import java.util.Locale;
import java.util.Random;

public class CW38 {
    private static Double water = 1.0;

    public static void main(String[] args) {
        Object lock = new Object();
        Random rng = new Random();

        Thread waterRefiller = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(rng.nextInt(3000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    water += 1.0;
                    System.out.println("Dolano wody, obecny stan: " + String.format(Locale.ENGLISH, "%.1f", water));
                    lock.notifyAll();
                }
            }
        });

        Thread coffeeMaker1 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    while (water < 0.2) {
                        System.out.println("[S1] Ni ma wody :/");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    water -= 0.2;
                    System.out.println("[S1]: " + i + " - Czarna kawa, zostało wody: "
                            + String.format(Locale.ENGLISH,
                            "%.1f",
                            water));
                }
            }
        });

        Thread coffeeMaker2 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    while (water < 0.2) {
                        System.out.println("[S2] Ni ma wody :/");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    water -= 0.2;
                    System.out.println("[S2]: " + i + " - Czarna kawa, zostało wody: "
                            + String.format(Locale.ENGLISH,
                            "%.1f",
                            water));

                }
            }
        });

        waterRefiller.start();
        coffeeMaker1.start();
        coffeeMaker2.start();
    }
}
