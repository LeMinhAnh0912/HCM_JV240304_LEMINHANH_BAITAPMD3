package Day3.BTTH;

import java.util.Scanner;

public class BTTH2 {
    public static void main(String[] args) {
        String[] students = { "Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory",
                "Zoe", "Emily" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String nameString = scanner.nextLine();
        boolean isExist = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameString)) {
                System.out.println("Vị trí trong danh sách: " + i);
                isExist = false;
                break;
            }
        }
        if (isExist) {
            System.out.println("không tồn tại trong dánh sách");
        }
    }
}
