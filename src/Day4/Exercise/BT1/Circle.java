package src.Day4.Exercise.BT1;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String display() {
        return "Rectangle{" + "radius=" + radius + ", color=" + color + "}";
    }

}
