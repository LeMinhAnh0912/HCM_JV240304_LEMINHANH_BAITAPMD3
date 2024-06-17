package src.Day3.Exercise;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // IN:
        System.out.println("Nhập size");
        // Nhap:
        int size = scanner.nextInt();
        // Tao mang:
        int[] arr = new int[size];
        // Duyet:
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập " + i + ": ");
            // Nhap:
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
