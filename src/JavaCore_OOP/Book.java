package src.JavaCore_OOP;

import java.util.Calendar;
import java.util.Scanner;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String description;
    private Category category;

    //Constructor có tham số và không tham số:
    public Book() {

    }

    public Book(String id, String title, String author, int year, String description, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.category = category;
    }

    //Các phương thức get/set:

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void inputData(Category[] categories) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập id (bắt đầu bằng “B”, độ dài 4 kí tự, duy nhất): ");
            String idData = scanner.nextLine();
            if (idData.matches("B\\d{3}")) {
                this.id = idData;
                break;
            } else {
                System.out.println("Nhập lại id!");
            }
        }

        while (true) {
            System.out.println("Nhập tiêu đề (tối đa 100 kí tự): ");
            String titleData = scanner.nextLine();
            if (titleData.length() <= 100) {
                this.title = titleData;
                break;
            } else {
                System.out.println("Nhập lại đi");
            }
        }

        System.out.print("Nhập tên tác giả: ");
        while (true) {
            String author = scanner.nextLine();
            if (!author.isEmpty()) {
                this.author = author;
                break;
            } else {
                System.out.print("Tên tác giả không được bỏ trống, nhập lại: ");
            }
        }

        System.out.print("Nhập năm xuất bản (từ 1970 đến năm hiện tại): ");

        while (true) {
            int year = scanner.nextInt();
            if (year >= 1970 && year <= Calendar.getInstance().get(Calendar.YEAR)) {
                this.year = year;
                break;
            } else {
                System.out.print("Năm xuất bản không hợp lệ, nhập lại: ");
            }

        }

    }

}
