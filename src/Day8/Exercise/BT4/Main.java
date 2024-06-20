package src.Day8.Exercise.BT4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 5, 10);
        Shape circle = new Circle("Blue", 7);

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        circle.display();
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
