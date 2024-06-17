package src.Day4.BTTH2.RikkeiAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the studentId");
        String studentId = scanner.nextLine();

        System.out.println("Enter the studentName");
        String studentName = scanner.nextLine();

        System.out.println("Enter the sex");
        String sex = scanner.nextLine();

        System.out.println("Enter the className");
        String className = scanner.nextLine();

        System.out.println("Enter the age");
        int age = scanner.nextInt();

        System.out.println("Enter the address");
        String address = scanner.nextLine();
        Student student = new Student(studentId, studentName, sex, className, age, address);
        System.out.println(student.display());
    }
}
