package src.FirstDay;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        float width = scanner.nextFloat();
        System.out.println("Nhap chieu rong");
        float height = scanner.nextFloat();
        System.out.println("Chu vi:" + (width + height)*2);
            System.out.println("Dien tich:" + width * height);
    }
}
