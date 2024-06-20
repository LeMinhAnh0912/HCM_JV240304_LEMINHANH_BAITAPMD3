package src.Day8.Exercise.BT4;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void display() {
        System.out.println("Color: " + color);
    }
}
