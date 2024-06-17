package src.Day3.Exercise;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 3, 5, 7, 9, 12, 15, 17, 19 };
        int N = array.length;
        System.out.println("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();
        int indexDelete = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                indexDelete = i;
                break;
            }
        }
        if (indexDelete != -1) {
            for (int i = indexDelete; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Mảng mới sau khi xoá phần tử " + X + " là:");
    }
}
