package src.FirstDay;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon Toan");
        float Math = scanner.nextFloat();
        System.out.println("Nhap diem mon Van");
        float Literature = scanner.nextFloat();
                System.out.println("Nhap diem mon Anh");
                      float English = scanner.nextFloat();
        System.out.println("Tong 3 mon:" + (Math + Literature + English ));
            System.out.println("Trung binh 3 mon:" + (Math + Literature + English ) / 3);
    }
}
