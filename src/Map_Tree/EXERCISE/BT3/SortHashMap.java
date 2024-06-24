package src.Map_Tree.EXERCISE.BT3;


import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        // B1: Khai báo một HashMap và thêm các phần tử vào
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 5);
        hashMap.put("Two", 2);
        hashMap.put("Three", 8);
        hashMap.put("Four", 1);
        hashMap.put("Five", 6);

        // B2: Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // B3: Sử dụng phương thức Collections.sort() để sắp xếp danh sách các phần tử theo giá trị tăng dần của chúng
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // B4: Duyệt qua danh sách đã sắp xếp và in các phần tử và giá trị của chúng theo thứ tự tăng dần
        System.out.println("HashMap sorted by values: ");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
