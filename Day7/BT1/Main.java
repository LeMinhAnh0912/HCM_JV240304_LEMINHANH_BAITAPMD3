package BT1;

public class Main {
    public static void main(String[] args) {

        String str = "Rikkei Academy";
        String str2 = "";

        // isEmpty() : kiểm tra xem chuỗi có rỗng hay không
        System.out.println("isEmpty(): " + str.isEmpty());
        System.out.println("isEmpty(): " + str2.isEmpty());

        // trim() : loại bỏ khoảng trắng ở 2 đầu
        System.out.println("trim(): '" + str.trim() + "'");
        System.out.println("trim(): '" + str2.trim() + "'");

        // equals() : kiểm tra xem hai chuỗi có giống nhau hay không (phân biệt hoa
        // thường)
        System.out.println("equals(): " + str.equals(str2));

        // equalsIgnoreCase() : kiểm tra xem hai chuỗi có giống nhau hay không (không
        // phân biệt hoa thường)
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(str2));

        // split() : tách một chuỗi thành một mảng các từ
        String[] words = str.trim().split(" ");
        System.out.println("split(): ");
        for (String word : words) {
            System.out.println(word);
        }

        // concat() : nối hai chuỗi lại với nhau
        String concatenatedString = str.concat(str2);
        System.out.println("concat(): " + concatenatedString);

        // contains() : kiểm tra chuỗi s1 chứa chuỗi s2 không (trả vefe true false)
        System.out.println("contains('Java'): " + str.contains("Java"));

        // toUpperCase() : chuyển chữ thường trong chuỗi thành chữ hoa
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toUpperCase(): " + str2.toUpperCase());

        // toLowerCase() : chuyển chữ hoa trong chuỗi thành chữ thường
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toLowerCase(): " + str2.toLowerCase());

        // replace() : thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi
        // mới
        System.out.println("replace('Java', 'Python'): " + str.replace("Java", "Python"));
        System.out.println("replace('Java', 'Python'): " + str2.replace("Java", "Python"));

        // length() : lấy độ dài của chuỗi
        System.out.println("length(): " + str.length());
        System.out.println("length(): " + str2.length());
    }
}
