package src.Map_Tree.EXERCISE.BT5;

import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomList =
                Stream.generate(() -> random.nextInt(50))
                        .limit(50)
                        .toList();// thuật toán random 100 số ngẫu nhiên từ 0- 1000
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (Integer e : randomList) {
            tree.put(e, 0);
            // đề cho mặc định value bằng 0
        }
        for (Integer key : tree.keySet()) {
            System.out.println("Key " + key);
        }

        System.out.println("Phần tử nhỏ nhất trong tree map : " + tree.firstKey());
        System.out.println("Phần tử lơn thứ 2 trong tree map : " + tree.lowerKey(tree.lastKey()));
        // lowerKey: bé hơn, floorKey: bé hơn hoặc bằng

        NavigableSet<Integer> integers = tree.descendingKeySet();
        while (!integers.isEmpty()) {
            System.out.println(integers.pollFirst());
        }
    }
}
