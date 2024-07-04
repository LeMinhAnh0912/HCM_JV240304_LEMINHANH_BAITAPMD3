package src.Exception_Handling_and_Debug.exercise.bt3;

public class SumIntergerArray {
    public static void main(String[] args) {
        // Mảng chứa các số nguyên và các phần tử khác
        Object[] arr = {1, 2, 3, "four", 5, 6};

        int sum = 0;

        // Duyệt mảng bằng vòng lặp for với biến đếm i
        for (int i = 0; i < arr.length; i++) {
            try {
                // Ép kiểu và tính tổng nếu arr[i] là số nguyên
                if (arr[i] instanceof Integer) {
                    sum += (Integer) arr[i];
                }
            } catch (ClassCastException e) {
                // Xảy ra ngoại lệ nếu arr[i] không thể ép kiểu sang Integer
                System.out.println("Error: Element '" + arr[i] + "' is not an integer. Skipping.");
            }
        }

        System.out.println("Sum of integers in the array: " + sum);
    }
}
//Toán tử instanceof trả về true nếu object có thể được ép kiểu thành ClassName,
// ngược lại trả về false. Nó cũng trả về false nếu object là null.

//Ví dụ, trong đoạn mã trước, câu lệnh arr[i] instanceof Integer được sử dụng để
// kiểm tra xem arr[i] có phải là một số nguyên (Integer) hay không trước khi thực hiện phép cộng.