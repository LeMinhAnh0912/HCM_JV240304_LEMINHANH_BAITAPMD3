package src.Exception_Handling_and_Debug.exercise.bt8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số cần kiểm tra: ");

            // Bước 1: Khai báo biến và nhập dữ liệu
            int number = scanner.nextInt();

            // Bước 2: Kiểm tra điều kiện số không phải số nguyên tố
            if (number <= 1) {
                System.out.println("Lỗi: Số không phải là số nguyên tố.");
                return; // Kết thúc chương trình nếu số không phải số nguyên tố
            }

            // Bước 3: Kiểm tra tính số nguyên tố
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Bước 4: Hiển thị kết quả
            if (isPrime) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không phải là số nguyên tố.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
        }
    }
}
