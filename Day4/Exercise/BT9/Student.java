package Day4.Exercise.BT9;

import java.util.Scanner;

public class Student {
    // Xây dựng lớp Student gồm các thuộc tính như:
    private int studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // các phương thức khởi tạo (constructor) 0 tham số:
    public Student() {
    };

    // các phương thức khởi tạo (constructor) có tham số:
    public Student(int studentId, String studentName, int age, String gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của
    // đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter StudentId: ");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter StudentName: ");
        this.studentName = scanner.nextLine();
        System.out.print("Enter Age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Gender: ");
        this.gender = scanner.nextLine();
        System.out.print("Enter Address ");
        this.address = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        this.phoneNumber = scanner.nextLine();
    };

    // phương thức displayData() cho phép hiển thị toàn bộ thông tin
    // học sinh.
    public void displayData() {
        System.out.println("StudentId: " + this.studentId);
        System.out.println("StudentName: " + this.studentName);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
        System.out.println("phoneNumber: " + this.phoneNumber);
    }

}
