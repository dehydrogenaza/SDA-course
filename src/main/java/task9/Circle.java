//Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
//
//        Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów, klasa Circle ma określać:
//        • promień okręgu przy wywołaniu metody double getRadius()
//        • obwód okręgu przy wywołaniu metody double getPerimeter()
//        • pole okręgu przy wywołaniu metody double getArea()
//        • (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()

package task9;

public class Circle implements Movable<Circle>, Resizable<Circle> {
    private Point2D center;
    private Point2D point;

    private double xOffset;
    private double yOffset;
    private double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;

        setInternals();
    }

    @Override
    public Circle move(MoveDirection md) {
        center = center.move(md);
        point = point.move(md);

        setInternals();
        return this;
    }

    @Override
    public Circle resize(double resizeFactor) {
        double newX = xOffset * resizeFactor + center.getX();
        double newY = yOffset * resizeFactor + center.getY();
        point = new Point2D(newX, newY);

        setInternals();
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Point2D[] getSlicePoints() {
        Point2D[] slicePoints = new Point2D[4];
        slicePoints[0] = point;

        double alpha = Math.asin(yOffset / radius);
        for (int i = 1; i < 4; i++) {
            alpha += Math.PI * 0.5;
            double sliceX = radius * Math.cos(alpha) + center.getX();
            double sliceY = radius * Math.sin(alpha) + center.getY();
            slicePoints[i] = new Point2D(sliceX, sliceY);
        }

        return slicePoints;
    }

    @Override
    public String toString() {
        return "Środek: " + center + ", promień: " + radius;
    }

    private void setInternals() {
        xOffset = point.getX() - center.getX();
        yOffset = point.getY() - center.getY();
        radius = Math.sqrt(Math.pow(xOffset, 2) + Math.pow(yOffset, 2));
    }
}
