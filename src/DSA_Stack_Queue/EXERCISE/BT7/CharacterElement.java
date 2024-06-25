package src.DSA_Stack_Queue.EXERCISE.BT7;

import java.util.Scanner;
import java.util.Stack;

public class CharacterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine().trim().toLowerCase();
        for (Character c : input.toCharArray()) stack.push(c);
        boolean isFlag = true;
        while (!stack.isEmpty()) {
            Character firstChar = stack.pop();
            for (Character c : stack) {
                if (firstChar > c) {
                    isFlag = false;
                    break;
                }
            }
        }
        if (isFlag) System.out.println("Giam dan");
        else System.err.println("Day khong phai la giam dan");
    }


}
