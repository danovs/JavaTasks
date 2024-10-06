interface Shape {
    double area();
    double perimeter();

}

abstract class Polygon implements Shape {

    abstract int numberOfSides();
}

class Triangle extends Polygon {

    private double A;
    private double B;
    private double C;

    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }


    @Override
    public double area() {
        double s = perimeter();
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public double perimeter() {
        return A + B + C;
    }
    @Override
    int numberOfSides() {
        return 3;
    }
}

class Rectangle extends Polygon {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    int numberOfSides() {
        return 4;
    }
}
class Circle implements Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

public class Shapes {
    public static void main(String[] args) {

        Shape triangle = new Triangle(5, 3, 2);
        Shape rectangle = new Rectangle(4, 4);
        Shape circle = new Circle(10);

        System.out.println("Площадь треугольника: " + triangle.area() + "\n" +
                "Периметр треугольника: " + triangle.perimeter() + "\n" +
                "Сколько сторон у треугольника: " + ((Polygon) triangle).numberOfSides() + "\n");
        System.out.println("Площадь прямоугольника: " + rectangle.area() + "\n" +
                "Периметр прямоугольника: " + rectangle.perimeter() + "\n" +
                "Сколько сторон у прямоугольника: " + ((Polygon) rectangle).numberOfSides() + "\n");
        System.out.println("Площадь круга: " + circle.area() + "\n" +
                "Периметр круга: " + circle.perimeter() + "\n");
    }
}
