package BT4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productId = "";

        while (true) {
            System.out.println("Nhập mã sản phẩm");
            productId = sc.nextLine();
            boolean checkProductId = Pattern.matches("^[CSA][0-9]{3}$", productId);
            if (!checkProductId){
                System.out.println("C: các đồ uống là café, S: các đồ uống là sinh tố, A: các đồ ăn nhanh");
            } else break;
        }
    }
}
