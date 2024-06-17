package src.Day4.Exercise.BT4;

public class Fan {
    // 3 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu
    // thị tốc độ quạt:
    // Constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor
    public Fan() {
        // Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc
        // định là SLOW:
        this.speed = SLOW;
        // Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định
        // là false (tắt):
        this.on = false;
        // Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc
        // định là 5:
        this.radius = 5.0;
        // Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là
        // blue:
        this.color = "blue";
    }

    // Getters and Setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius + " - fan is on";
        } else {
            return "Fan color: " + color + ", radius: " + radius + " - fan is off";
        }
    }

}
