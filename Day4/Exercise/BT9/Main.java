package Day4.Exercise.BT9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khởi tạo danh sách Student có độ rộng 100 phần tử:
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Hiển thị danh sách tất cả các học sinh");
            System.out.println("2: Thêm mới học sinh");
            System.out.println("3: Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4: Xoá học sinh");
            System.out.println("5: Thoát");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Hiển thị danh sách tất cả học sinh:
                    if (students.isEmpty()) {
                        System.out.println("Danh sách học sinh trống.");
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
