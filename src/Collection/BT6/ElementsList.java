package src.Collection.BT6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementsList {
    public static void main(String[] args) {
//        Viết một chương trình Java để xóa các phần tử trùng lặp trong một List các số nguyên.
        Scanner sc = new Scanner(System.in);
//        Tạo 1 list các số nguyên chứa các phần tử cho sẵn hoặc thêm mặc mặc định các phần tử.
        List<Integer> originList = new ArrayList<>();
        System.out.println("Nhập số phần tử của list: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < n; i++) {
            originList.add(Integer.parseInt(sc.nextLine()));
        }

//        Tạo 1 list mới để chứa các phần tử không trùng lặp
        List<Integer> newList = new ArrayList<>();
//        Duyệt list cũ sử dụng phương thức contains() để check trùng lặp nếu phần tử chưa tồn tại trong list mới thì add phần tử đó vào list mới .

        for (Integer element : originList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
//         In ra danh sách các phần tử trong list mới ta thu được 1 list mới chứa các phần tử không trùng lặp.

        System.out.println("Danh sách các phần tử không trùng lặp: ");
        for (Integer element : newList) {
            System.out.println(element + " ");
        }
    }
}
