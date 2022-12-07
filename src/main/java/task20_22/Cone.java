package task20_22;

public class Cone implements Shape3D {
    private final double r, h, l;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        this.l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(r, 2.0) * h / 3.0;
    }
}
