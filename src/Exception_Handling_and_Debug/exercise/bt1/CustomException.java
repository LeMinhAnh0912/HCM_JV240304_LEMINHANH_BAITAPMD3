package src.Exception_Handling_and_Debug.exercise.bt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public class SumInt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstNumber = 0, secondNumber = 0;
            boolean validInput = false;

            // Bước 2: Lặp cho đến khi nhập đúng
            while (!validInput) {
                try {
                    // Yêu cầu nhập số thứ nhất
                    System.out.print("Nhập số thứ nhất: ");
                    firstNumber = scanner.nextInt();
                    validateNumber(firstNumber);  // Kiểm tra số nhập vào

                    // Yêu cầu nhập số thứ hai
                    System.out.print("Nhập số thứ hai: ");
                    secondNumber = scanner.nextInt();
                    validateNumber(secondNumber);  // Kiểm tra số nhập vào

                    // Nếu không có ngoại lệ, thoát vòng lặp
                    validInput = true;
                } catch (InputMismatchException e) {
                    // Hiển thị thông báo lỗi và yêu cầu nhập lại
                    System.out.println("Giá trị không hợp lệ. Vui lòng nhập một số nguyên.");
                    scanner.next(); // Xóa bỏ giá trị không hợp lệ khỏi bộ đệm
                } catch (CustomException e) {
                    // Hiển thị thông báo lỗi và yêu cầu nhập lại
                    System.out.println(e.getMessage());
                }
            }

            // Bước 3: Tính tổng và hiển thị kết quả
            int sum = firstNumber + secondNumber;
            System.out.println("Tổng của hai số là: " + sum);

        }
    }

    private static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Số không được nhỏ hơn 0. Vui lòng nhập lại.");
        }
    }

}

