package src.Day4.Exercise.BT8;

import java.util.Scanner;

public class Employee {
    // Xây dựng lớp Employee gồm các thuộc tính như:
    private int employeeId; // (employeeId: mã nhân viên)
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // các phương thức khởi tạo (constructor) 0 tham số:
    public Employee() {
    };

    // các phương thức khởi tạo (constructor) có tham số:
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    };

    // Phương thức nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        // consume newline

        System.out.print("Enter Employee Name: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Enter Age: ");
        this.age = Integer.parseInt(scanner.nextLine());
        // consume newline

        System.out.print("Enter Gender: ");
        this.gen = scanner.nextLine();

        System.out.print("Enter Rate: ");
        this.rate = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gen);
        System.out.println("Rate: " + this.rate);
        System.out.println("Salary: " + this.salary);
    }

    // Phương thức tính lương
    public void calSalary() {
        this.salary = this.rate * 1300000;
    }
}
