package task38;



public class CoffeeRunnable implements Runnable {
    private final WaterTank tank;

    public CoffeeRunnable(WaterTank tank) {
        this.tank = tank;
    }

    @Override
    public void run() {
        tank.useWater();
    }
}
