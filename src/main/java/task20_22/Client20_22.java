package task20_22;

public class Client20_22 {
    public static void main(String[] args) {

        System.out.println("TRÓJKĄT");
        Shape2D triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        System.out.println("PROSTOKĄT");
        Shape2D rectangle = new Rectangle(10, 2);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println("SZEŚCIOKĄT FOREMNY");
        Shape2D hexagon = new RegularHexagon(5);
        System.out.println(hexagon.calculatePerimeter());
        System.out.println(hexagon.calculateArea());

        System.out.println("STOŻEK OBROTOWY");
        Shape3D cone = new Cone(10, 2);
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculateVolume());
        cone.fill(200);
        cone.fill(1000);

        System.out.println("SZEŚCIAN");
        Shape3D cube = new Cube(10);
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());
        cube.fill(1000);
        cube.fill(1001);
        cube.fill(999);
    }
}
