package src.Exception_Handling_and_Debug.exercise.bt2;

import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Khai báo biến và nhập dữ liệu
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Step 2: Kiểm tra trường hợp mảng rỗng
        if (n <= 0) {
            try {
                throw new Exception("Mảng không có phần tử nào hoặc số lượng phần tử không hợp lệ.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return; // Kết thúc chương trình nếu có ngoại lệ
            }
        }

        // Khởi tạo mảng số nguyên
        int[] arr = new int[n];

        // Nhập các phần tử của mảng từ người dùng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Tìm số lớn nhất
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 4: Hiển thị kết quả
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
