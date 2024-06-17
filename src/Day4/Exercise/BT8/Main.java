package src.Day4.Exercise.BT8;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng chứa 5 đối tượng nhân viên
        Employee[] employees = new Employee[1];

        // Nhập thông tin, tính lương và hiển thị thông tin cho từng nhân viên
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Enter information for Employee " + (i + 1) + ":");
            employees[i].inputData();
            employees[i].calSalary();
        }

        // Hiển thị thông tin tất cả các nhân viên
        System.out.println("\nEmployee Information:");
        for (Employee emp : employees) {
            emp.displayData();
            System.out.println();
        }
    }
}
