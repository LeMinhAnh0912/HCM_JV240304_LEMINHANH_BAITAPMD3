package src.Collection.BT4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        //Viết chương trình để tạo một danh sách chứa các số nguyên và sắp xếp danh sách theo thứ tự tăng dần. (không sử dụng hàm có sẵn)'
        Scanner scanner = new Scanner(System.in);
//        B1: Tạo 1 list số nguyên,
        List<Integer> numberList = new ArrayList<>();

//        B2: Thêm phần tử vào list
        System.out.println("Nhập vào số lượng phần tử của list: ");
        int numbers = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào các phần tử của list: ");

        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numberList.add(number);
        }

//        B3: Sử dụng 1 trong 3 thuật toán sắp xếp (nổi bọt, chọn, chèn) để sắp xếp các phần tử theo thứ tự tăng dần và in ra danh sách vừa sắp xếp.
        System.out.println("Danh sách sau khi sắp xếp: ");

        for (Integer number : numberList) {
            System.out.println(number + " ");
        }
    }


}

