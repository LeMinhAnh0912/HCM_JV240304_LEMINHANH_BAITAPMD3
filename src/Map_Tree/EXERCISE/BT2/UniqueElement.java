package src.Map_Tree.EXERCISE.BT2;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElement {
    public static void main(String[] args) {
        String[] arr = {"apple", "strawberry", "blueberry", "apple", "banana", "apple", "orange", "apple", "grape"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String element : arr) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                hashMap.put(element, 1);
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                arrayList.add(key);
            }
        }

        // Bước 4: In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng là: ");
        for (String unique : arrayList) {
            System.out.print(unique + " ");
        }
    }

}
