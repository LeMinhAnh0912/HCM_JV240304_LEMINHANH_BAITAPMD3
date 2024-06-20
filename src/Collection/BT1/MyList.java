package src.Collection.BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {
        //Scaner để cho nhập
        Scanner scanner = new Scanner(System.in);
        //Tạo list số nguyên
        List<Integer> list = new ArrayList<>();
        //khai báo 1 biến để nhập vào số nguyên có tối đa 10 phần tử
        System.out.println("Nhập số nguyên có tối đa 10 phần tử");
        int numbers = scanner.nextInt();
        //Giới hạn so lượng tối đa 10 phần tử
        numbers = Math.min(numbers, 10);
        //Chạy vòng lặp for để nhập phần tử vào danh sách
        System.out.println("Nhập phần tử trong danh sách: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            list.add(scanner.nextInt()); //list.add(6) là đã nhập sắn sô để thêm vào mảng, còn scaaner chỉ để nhập số vào trong mảng.
        }
        //In list số nguyên ban đầu
        System.out.println("Danh sách số nguyên ban đầu: " + list);
        //Sử dụng phương thức Collections.max() của lớp Collections để tìm và in ra phần tử có giá trị lớn nhất
        //(khai  báo 1 biến = collection để tìm ra gái trị lớn nhất)
        int numberMax = Collections.max(list);
        System.out.println("Phần tử có giá trị lớn nhất: " + numberMax);

        //Sử dụng phương thức Collections.reverse() của lớp Collections để đảo ngược vị trí các phần tử trong danh sách.
        Collections.reverse(list);
        System.out.println("Phần tử đã đảo ngược: " + list);

        //Sử dụng phương thức Collections.soft() của lớp Collections để sắp xếp các phần tử trong danh sách treo giá trị tăng dần.
        Collections.sort(list);
        System.out.println("Phần tử đã sắp xếp: " + list);

        //Sử dụng phương thức addAll() của lớp Collections để sao chép các phần tử trong danh sách 2 sang danh sách 1 ( list1.addAll(list2) )
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Nhập phần tử trong danh sách 2: ");
        list2.add(scanner.nextInt());
        list.addAll(list2);
        System.out.println("Danh sách sao chép: " + list);
    }
}
