package src.Collection.BT2;

import java.util.ArrayList;
import java.util.List;

public class RikkeiAcademy {
    public static void main(String[] args) {
//        B1: Tạo chuỗi có giá trị là: “Rikkei Academy để nông dân biết code”
        String str = "Rikkei Academy để nông dân biết code";
//        B2: Tạo 1 list có các pt kiểu String.
        List<String> listRikkei = new ArrayList<>();
//        B3: Convert (Chuyển thành) chuỗi ở bước 1 thành các phần tử trong mảng(Array) rồi gán vào list được tạo ở bước.
//            (Chuyển đổi chuỗi thành mảng: split)
        String[] words = str.split(" ");
        for (String word : words) {
            listRikkei.add(word);
        }
//        B4: Duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        for (String word : listRikkei) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}
