package src.FirstDay;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Binh phuong cua so a");
        int a  = scanner.nextInt();
              System.out.println("Lap phuong cua so a");
        int aa  = scanner.nextInt();
        System.out.println("Binh phuong:" + a * a);
             System.out.println("Lap phuong:" + (a * a) * a);
    }
}
