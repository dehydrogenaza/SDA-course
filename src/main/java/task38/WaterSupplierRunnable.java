package task38;

public class WaterSupplierRunnable implements Runnable {
    private final WaterTank tank;

    public WaterSupplierRunnable(WaterTank tank) {
        this.tank = tank;
    }

    @Override
    public void run() {
        tank.addWater(5);
    }
}
