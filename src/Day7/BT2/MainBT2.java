package src.Day7.BT2;

public class MainBT2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append(String s): được sử dụng để nối thêm các chuỗi được chỉ định với chuỗi
        // này.
        stringBuffer.append(" World");
        System.out.println("Sau khi append: " + stringBuffer);

        // insert(int offset, String s): được sử dụng để chèn chuỗi chỉ định với chuỗi
        // này tại vị trí quy định
        stringBuffer.insert(11, " Java ");
        System.out.println("Sau khi insert: " + stringBuffer);

        // replace(int startIndex, int endIndex, String str): được sử dụng để thay thế
        // chuỗi từ vị trị startIndex đến endIndex bằng chuỗi str:
        stringBuffer.replace(6, 11, "Amazing");
        System.out.println("Sau khi replace: " + stringBuffer);

        // delete(int startIndex, int endIndex): được sử dụng để xóa chuỗi từ vị trí
        // startIndex đến endIndex.
        stringBuffer.delete(0, 5);
        System.out.println("Sau khi delete: " + stringBuffer);

        // length(): được sử dụng trả về chiều dài của chuỗi nghĩa là tổng số ký tự.
        int length = stringBuffer.length();
        System.out.println("Chiều dài của chuỗi: " + stringBuffer.length());

        // reverse(): được sử dụng để đảo ngược chuỗi.
        stringBuffer.reverse();
        System.out.println("Chuỗi đảo ngược: " + stringBuffer);
    }
}
