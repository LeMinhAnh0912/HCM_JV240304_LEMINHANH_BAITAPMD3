package src.DSA_Stack_Queue.EXERCISE.BT5;

import java.util.Stack;

public class SortElement {
    public static void main(String[] args) {
        int[] arr = {20, 3, 10, 2, 5, 15, 45, 50};
        int maxElement = findMaxElement(arr);
        System.out.println("Phần tử lớn nhất trong mảng: " + maxElement);

    }

    private static int findMaxElement(int[] arr) {
//      B1: Tạo một stack rỗng để lưu trữ các phần tử.
        Stack<Integer> stack = new Stack<>();
//      B2: Duyệt qua từng phần tử trong mảng
//      Nếu stack rỗng hoặc phần tử đang xét lớn hơn phần tử trên đỉnh của stack, đưa phần tử đó vào stack.
//      - Ngược lại, lấy phần tử trên đỉnh của stack ra khỏi stack.

        for (int element : arr) {
            if (stack.isEmpty() || element > stack.peek()) {
                stack.push(element);
            } else {
                while (!stack.isEmpty() && stack.peek() > element) {
                    stack.pop();
                }
                stack.push(element);
            }

        }

//      B3: In ra phần tử lớn nhất nằm trên đỉnh của stack.
        return stack.peek();
    }
}
//peek(): truy xuất hoặc tìm nạp phần tử đầu tiên của Stack hoặc phần tử có ở đầu Stack.
// Phần tử được truy xuất không bị xóa hoặc xóa khỏi Stack.

//Phần tử trên đỉnh của ngăn xếp (stack) được gọi là top.

//pop: Xóa or lấy phần tử ở đầu stack (lấy từ phần tử cuối LIFO)

// Stack là một kiểu cấu trúc dữ liệu hoạt động theo nguyên tắc LIFO (Last In First Out)
// nghĩa là phần tử cuối cùng được thêm vào sẽ là phần tử đầu tiên bị lấy ra.

