package src.Storing_and_Searching_Algorithm.EXERCISE.BT1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearSearch {
    // B1: Tạo một List số nguyên và gọi hàm getList() để gán
    public static List<Integer> getList() {
        Random random = new Random();
        return Stream.generate(() -> random.nextInt(50))
                .distinct()
                .limit(10)
                .collect(Collectors.toList());
    }

    // B2: In ra List số nguyên đó
    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }

    // B3: Cài đặt thuật toán tuyến tính để tìm ra số lớn nhất
    public static int findMaxIndex(List<Integer> list) {
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // B4: In số lớn nhất ra cùng với chỉ số của nó
    public static void main(String[] args) {
        List<Integer> listInt = getList();
        printList(listInt);
        int maxIndex = findMaxIndex(listInt);
        System.out.println("Số lớn nhất trong danh sách là: " + listInt.get(maxIndex) + " tại index " + maxIndex);
    }
}
