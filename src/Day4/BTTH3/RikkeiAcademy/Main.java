package src.Day4.BTTH3.RikkeiAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the categoryId: ");
        String categoryId = scanner.nextLine();

        System.out.println("Enter the categoryName: ");
        String categoryName = scanner.nextLine();

        System.out.println("Enter the productId: ");
        String productId = scanner.nextLine();

        System.out.println("Enter the productName: ");
        String productName = scanner.nextLine();

        System.out.println("Enter the productPrice: ");
        String productPrice = scanner.nextLine();

        System.out.println("Enter the category: ");
        String category = scanner.nextLine();

        Category category2 = new Category(categoryId, categoryName);
        Product product = new Product(productId, productName, productPrice, category);
        System.out.println(category2.display());
        System.out.println(product.display());
    }

}
