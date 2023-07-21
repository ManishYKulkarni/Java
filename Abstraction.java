// Abstract class representing a shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();

    // Concrete method for displaying information
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class representing a circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Shape circle = new Circle(5);    //Upcasting
        Shape rectangle = new Rectangle(3, 4); 

        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
