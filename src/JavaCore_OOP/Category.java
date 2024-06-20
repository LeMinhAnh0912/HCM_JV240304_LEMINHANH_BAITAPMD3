package src.JavaCore_OOP;

import java.util.Scanner;

public class Category {
    private static int idAuto = 0;
    private int bookId;
    private String bookName;
    private boolean bookStatus;

    public Category() {
        this.bookId = ++idAuto;
    }

    public Category(String bookName, boolean bookStatus) {
        this.bookId = ++idAuto;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookStatus=" + bookStatus +
                '}';
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tên thể loại");
//        bookName = scanner.nextLine();
//        System.out.println("Trạng thái thể loại(true/false)");
//        bookStatus = scanner.nextBoolean();

//validate:
        System.out.println("không trùng nhau, từ 6-30 kí tự");
        while (true) {
            String bookName = scanner.nextLine();
            if (bookName.length() >= 6 && bookName.length() <= 30) {
                this.bookName = bookName;
                break;
            } else {
                System.out.println("Không hợp lệ, vui lòng nhập lại");
            }
        }

        System.out.println("Trạng thái thể loại(true/false)");
        while (true) {
            boolean bookStatus = scanner.nextBoolean();
            if (bookStatus || !bookStatus) {
                this.bookStatus = bookStatus;
                break;
            } else {
                System.out.println("Không hợp lệ, vui lòng nhập lại");
            }
        }
    }

    public void displayData() {
        System.out.println("ID: " + bookId);
        System.out.println("Tên thể loại: " + bookName);
        System.out.println("Trạng thái thể loại: " + (bookStatus ? "Hoạt động" : "Không hoạt động"));
    }

}
