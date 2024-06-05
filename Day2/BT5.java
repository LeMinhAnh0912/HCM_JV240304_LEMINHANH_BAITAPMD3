package Day2;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn");
      int start = scanner.nextInt();
      int finish = scanner.nextInt();
      int sum =0;
for (int i = start; i <= finish; i++) {
    if (i % 2 == 0) {
        sum += i;
    }
}
System.out.println("Tổng các số chẵn là: " + sum);
    }
}
