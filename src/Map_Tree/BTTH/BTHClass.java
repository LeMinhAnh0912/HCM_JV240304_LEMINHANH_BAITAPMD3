package src.Map_Tree.BTTH;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BTHClass {
    public static void main(String[] args) {
        HashMap<String, String> customers = new HashMap<>();
        customers.put("a", "John");
        customers.put("b", "Mike");
        customers.put("c", "Bill");
        customers.put("d", "Maria");

        Set<String> keys = customers.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ": " + customers.get(key));
        }

        //EntrySet: Tra ve gia tri cua key
        for (Map.Entry<String, String> entry : customers.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());

        }

        //Ktra ton tai (tra ve true/false)
        System.out.println("Key cua a co ton tai hay khong? " + customers.containsKey("a"));

        //Remove: Xoa phan tu
        customers.remove("a");
        System.out.println("Origin: " + customers);


    }
}
