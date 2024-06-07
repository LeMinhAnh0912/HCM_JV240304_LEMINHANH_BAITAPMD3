package Day3.Exercise;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = 0; // Mặc định các phần tử có giá trị là 0
        }
        Scanner scanner = new Scanner(System.in);
        // Bước 2: Nhập X là số cần chèn
        int X = scanner.nextInt();
        System.out.print("Nhập số cần chèn X: ");
        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        int index = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (index): ");
        // Bước 4: Kiểm tra nếu index <= -1 hoặc index >= array.length
        if (index < 0 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            for (int i = N - 1; i > index; i--) {
                array[i] = array[i - 1]; // Đẩy các phần tử từ vị trí index trở đi lên một vị trí
            }
            array[index] = X; // Chèn X vào vị trí index
            // Bước 6: In ra mảng
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
