package src.Map_Tree.EXERCISE.BT1;

import java.util.HashMap;
import java.util.Map;

public class CountElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 3, 5, 7, 9,};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int element : arr) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                hashMap.put(element, 1);
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                System.out.println("Element: " + entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }
}
