package src.DSA_Stack_Queue.EXERCISE.BT1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        // B1: Tạo 1 Stack để lưu trữ văn bản
        Stack<String> stack = new Stack<>();

        // B2: Nhập số lượng từ cần nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng từ: ");
        int numberOfWords = Integer.parseInt(scanner.nextLine());

        // B3: Tạo 1 vòng lặp for với số lần lặp bằng số lượng từ vừa nhập
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }

        // B4: Tạo vòng lặp rồi in các từ trong stack ra bằng phương thức pop()
        System.out.println("Các từ theo thứ tự đảo ngược là: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}
