package src.Exception_Handling_and_Debug.exercise.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringConverseInterger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần chuyển đổi thành số nguyên: ");
        String inputString = scanner.nextLine();

        List<Integer> integerList = new ArrayList<>();

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < inputString.length(); i++) {
            try {
                // Chuyển đổi ký tự thành số nguyên
                int num = Integer.parseInt(String.valueOf(inputString.charAt(i)));
                integerList.add(num);
            } catch (NumberFormatException e) {
                // Nếu không phải số, thêm số 0 vào danh sách và thông báo
                integerList.add(0);
                System.out.println("Ký tự không phải số được thay thế bằng 0: " + inputString.charAt(i));
            }
        }

        // In danh sách số nguyên đã được chuyển đổi
        System.out.println("Danh sách số nguyên sau khi chuyển đổi: " + integerList);
    }
}
