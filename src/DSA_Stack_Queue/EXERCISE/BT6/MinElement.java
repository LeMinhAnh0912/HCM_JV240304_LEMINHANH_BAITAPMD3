package src.DSA_Stack_Queue.EXERCISE.BT6;


import java.util.LinkedList;
import java.util.Queue;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 3, 8, 4, 9, 6};
        int minElement = findMinElement(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }

    private static int findMinElement(int[] arr) {
        
        // B1: Tạo một queue rỗng để lưu trữ các phần tử.
        Queue<Integer> queue = new LinkedList<>();

//        B2: Duyệt qua từng phần tử trong mảng và đưa chúng vào queue.
        for (int number : arr) {
            queue.add(number);
        }

//        B3: Lấy phần tử đầu tiên trong queue ra khỏi queue.
        int minValue = queue.poll();

//        B4: So sánh phần tử đó với các phần tử khác trong queue,
//        nếu nhỏ hơn thì đưa phần tử đó vào cuối queue và lấy phần tử đầu tiên ra khỏi queue,
//        tiếp tục so sánh cho đến khi phần tử đầu tiên trong queue không còn nhỏ hơn các phần tử khác.
//        - Phần tử nhỏ nhất nằm ở đầu tiên của queue.
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current < minValue) {
                minValue = current;
            }
        }

        return minValue;
    }
}
//poll () Phương thức trả về giá trị của phần đầu của hàng đợi và loại bỏ phần đầu khỏi hàng đợi. Phương thức trả về null nếu hàng đợi trống.
