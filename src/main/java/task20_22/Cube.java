package task20_22;

public class Cube implements Shape3D {
    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }
}
