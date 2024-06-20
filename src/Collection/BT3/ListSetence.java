package src.Collection.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSetence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        B1: Tạo sẵn 1 chuỗi là một câu hoặc một đoạn văn.
        System.out.println("Nhập vào một câu hoặc một đoạn văn: ");
        String input = scanner.nextLine();
        //Tao arrayList
        List<String> wordList = new ArrayList<>(Arrays.asList(input.split(" ")));
//        B2: Convert từng từ trong chuỗi đó thành các phần tử trong list.
        //MAX_VALUE: Là một giá trị lớn nhất có thể đạt được trong kiểu int.
        int minLength = Integer.MAX_VALUE;
        for (String word : wordList) {
            if (word.length() < minLength) {
                minLength = word.length();
            } else {
            }
        }
//        B3: Tạo thêm một newList để lưu trữ những phần tử ngắn nhất được tìm thấy trong trường hợp có nhiều từ ngắn nhất có độ dài bằng nhau.
        List<String> newList = new ArrayList<>();

        for (String word : wordList) {
            if (word.length() == minLength) {
                newList.add(word);
            }
        }
//        B4: Duyệt newList để in ra kết quả những từ có độ dài ngắn nhất.
        System.out.println("Những từ có độ dài ngắn nhất: ");
        for (String word : newList) {
            System.out.println(word + " ");
        }
    }
}
