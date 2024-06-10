package Day3.Exercise;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng dòng mà bạn muốn:");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng cột mà bạn muốn:");
        int cols = Integer.parseInt(scanner.nextLine());
        // Tạo mảng:
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Nhập cột cần tính tổng:");
        int sum = 0;
        int h = Integer.parseInt(scanner.nextLine());
        if (h > cols) {
            System.out.println("Lỗi rồi bạn tôi ơi");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j == h) {
                        sum += arr[i][h];
                    }
                }
            }
            System.out.println("Tổng các số được nhập vào: " + sum);
        }
    }
}
