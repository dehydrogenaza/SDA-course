//Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor. Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
//
//        Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów, klasa Circle ma określać:
//        • promień okręgu przy wywołaniu metody double getRadius()
//        • obwód okręgu przy wywołaniu metody double getPerimeter()
//        • pole okręgu przy wywołaniu metody double getArea()
//        • (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()

package task9;

import java.util.Arrays;

public class Client9 {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(1, 1), new Point2D(1, -9));
        System.out.println(circle);
        System.out.println(Arrays.toString(circle.getSlicePoints()));

        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.getPerimeter());
        System.out.println("Pole: " + circle.getArea());

        System.out.println();
        Point2D point = new Point2D(3, 5);
        System.out.println("Punkt: " + point);
        System.out.println("Punkt: " + point.move(new MoveDirection(1, 0)).move(new MoveDirection(0, 5)));

        circle.move(new MoveDirection(-6, -3));
        System.out.println(circle);
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.getPerimeter());
        System.out.println("Pole: " + circle.getArea());

        System.out.println();
        circle.resize(2.5).resize(0.5);
        System.out.println(circle);
    }
}
