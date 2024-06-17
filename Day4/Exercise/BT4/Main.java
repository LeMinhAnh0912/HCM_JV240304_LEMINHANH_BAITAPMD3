package Day4.Exercise.BT4;

public class Main {
    // Phương thức khởi tạo không tham số tạo đối tượng fan mặc định:
    public static void main(String[] args) {
        // Create two Fan objects
        // Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là
        // yellow và quạt ở trạng thái bật:
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue
        // và quạt ở trạng thái tắt:
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display the objects
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
