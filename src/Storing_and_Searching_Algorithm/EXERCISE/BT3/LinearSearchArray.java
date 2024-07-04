package src.Storing_and_Searching_Algorithm.EXERCISE.BT3;

import java.util.Scanner;

public class LinearSearchArray {

    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng cho sẵn
        int[] arr = {2, 5, 7, 1, 9, 3, 6};

        // Bước 2: Nhập giá trị cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm tuyến tính trong mảng
        int position = linearSearch(arr, target);

        // Bước 4: In ra kết quả
        if (position != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }

        scanner.close();
    }

    // Phương thức tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí của giá trị cần tìm nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy giá trị
    }
}
