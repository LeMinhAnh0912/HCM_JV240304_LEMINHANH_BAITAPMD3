package Day2;

import java.util.Scanner;

public class BT9 {
 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
         
        while (true) {
            // Hiển thị menu
            System.out.println("Vui lòng chọn loại hình:");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");


            switch (choice) {
                case 1:
                    // Hình chữ nhật
                    System.out.print("Nhập chiều dài: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double width = scanner.nextDouble();
                    
                    double rectanglePerimeter = 2 * (length + width);
                    double rectangleArea = length * width;

                    System.out.println("Chu vi hình chữ nhật: " + rectanglePerimeter);
                    System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
                    break;
                case 2:
                    // Hình tam giác
                    System.out.print("Nhập cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập cạnh c: ");
                    double c = scanner.nextDouble();

                    double trianglePerimeter = a + b + c;
                    double semiPerimeter = trianglePerimeter / 2;
                    double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

                    System.out.println("Chu vi hình tam giác: " + trianglePerimeter);
                    System.out.println("Diện tích hình tam giác: " + triangleArea);
                    break;
                case 3:
                    // Hình tròn
                    System.out.print("Nhập bán kính R: ");
                    double radius = scanner.nextDouble();
                    
                    double circlePerimeter = 2 * Math.PI * radius;
                    double circleArea = Math.PI * Math.pow(radius, 2);

                    System.out.println("Chu vi hình tròn: " + circlePerimeter);
                    System.out.println("Diện tích hình tròn: " + circleArea);
                    break;
                case 0:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    // Lựa chọn không hợp lệ
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
 }   
}
