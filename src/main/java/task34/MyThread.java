package task34;

public class MyThread extends Thread {

    @Override
    public void run() {
        //super.run();
        System.out.println(Thread.currentThread().getName());
    }
}
