package src.Exception_Handling_and_Debug.exercise.bt7;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        while (true) {
            try {
                // Nhập số thứ nhất
                System.out.print("Nhập số nguyên thứ nhất: ");
                number1 = Integer.parseInt(scanner.nextLine());

                // Nhập số thứ hai
                System.out.print("Nhập số nguyên thứ hai: ");
                number2 = Integer.parseInt(scanner.nextLine());

                // Tìm số lớn nhất
                int max = Math.max(number1, number2);

                // Hiển thị kết quả
                System.out.println("Số lớn nhất là: " + max);

                break; // Kết thúc vòng lặp khi đã có kết quả hợp lệ
            } catch (NumberFormatException e) {
                // Xử lý khi người dùng nhập không phải số nguyên
                System.out.println("Lỗi: Bạn đã nhập không phải số nguyên. Vui lòng nhập lại.\n");
                // Tiếp tục vòng lặp để yêu cầu nhập lại
            }
        }
        
    }
}
