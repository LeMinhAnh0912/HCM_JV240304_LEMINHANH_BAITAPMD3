package BT3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo biểu thức chính quy để kiểm tra địa chỉ email
        String regex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,6}$";

        // Tạo đối tượng Scanner để nhập chuỗi từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập địa chỉ email cần kiểm tra
        System.out.println("Nhập địa chỉ email cần kiểm tra: ");
        String emailToCheck = scanner.nextLine();

        // Kiểm tra địa chỉ email có hợp lệ hay không
        boolean isValid = Pattern.matches(regex, emailToCheck);

        // In kết quả kiểm tra
        if (isValid) {
            System.out.println("Địa chỉ email hợp lệ.");
        } else {
            System.out.println("Địa chỉ email không hợp lệ.");
        }
    }
}
