package src.Collection.BT5;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        //Viết chương trình để tạo một ArrayList chứa các số nguyên và xóa tất cả các số chẵn trong danh sách
//        B1: Tạo 1 list số nguyên,
        ArrayList<Integer> numbers = new ArrayList<>();
//        B2: Thêm phần tử vào list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các số phần tử của danh sách: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập các phần tử của danh sách: ");
        //Duyệt mảng bằng vong lặp for:
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers.add(number);
            // hoặc
            // numbers.add(Integer.parseInt(scanner.nextLine()));
        }
//        B3: Tạo list số nguyên mới để lưu những số nguyên không chia hết cho 2
        ArrayList<Integer> newNumbers = new ArrayList<>();
//        B4: Duyệt list đó và gán những số thỏa mãn điều kiện vào list mới.
        for (int number : numbers) {
            if (number % 2 != 0) {
                newNumbers.add(number);
            }
        }

        // In ra danh sách các số lẻ
        System.out.println("Danh sách các số lẻ sau khi đã xóa các số chẵn: ");
        for (int number : newNumbers) {
            System.out.println(number + " ");
        }

    }
}
