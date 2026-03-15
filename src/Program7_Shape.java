abstract class Shape {

    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a Shape class");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class Program7_Shape {
    public static void main(String[] args) {

        // Shape s = new Shape(); // This will give compilation error

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        System.out.println("Area of Circle: " + c.calculate_area());

        r.display_info();
        System.out.println("Area of Rectangle: " + r.calculate_area());
    }
}