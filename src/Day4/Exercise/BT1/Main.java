package src.Day4.Exercise.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Để đọc dòng mới sau khi nhập bán kính
        System.out.print("Nhập màu sắc: ");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius, color);
        System.out.println("Bán kính" + circle.display());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
