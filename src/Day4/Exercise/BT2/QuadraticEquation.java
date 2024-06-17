package src.Day4.Exercise.BT2;

public class QuadraticEquation {

    // Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số.
    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b và c:
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức gettter cho a, b và c:
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac:
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình là:
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}
