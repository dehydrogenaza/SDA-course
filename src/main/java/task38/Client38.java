package task38;

//Napisz aplikację, która będzie symulować maszynę do robienia kawy.
//        W przypadku, gdy dowolna cykliczna usługa parzenia kawy zastanie pusty zbiornik na wodę, powinno nastąpić wstrzymanie wątku.
//        W momencie, gdy w maszynie zostanie uzupełniona woda, powinno nastąpić wzbudzenie wątku.

public class Client38 {

    public static void main(String[] args) {
        int numOfThreads = 3;

        WaterTank waterTank = new WaterTank();

        Runnable[] runnables = new CoffeeRunnable[numOfThreads];
        Thread[] threads = new Thread[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            runnables[i] = new CoffeeRunnable(waterTank);
            threads[i] = new Thread(runnables[i]);

            threads[i].start();
        }

        Thread supplierThread = new Thread(new WaterSupplierRunnable(waterTank));
        supplierThread.start();
    }

}
