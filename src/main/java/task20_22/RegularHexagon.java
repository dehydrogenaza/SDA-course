package task20_22;

public class RegularHexagon implements Shape2D {
    private final double s;

    public RegularHexagon(double s) {
        this.s = s;
    }

    @Override
    public double calculateArea() {
        return (3.0 * Math.sqrt(3.0) * Math.pow(s, 2.0)) / 2.0;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * s;
    }
}
