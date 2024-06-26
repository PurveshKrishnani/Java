package CollectionFramework.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.print("Enter the number of keys: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = scanner.nextLine();

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        //Printing the LinkedHashMap using a for-each loop (key-value pairs)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(" ");

        //Printing the LinkedHashMap using an Iterator (key-value pairs):
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(" ");



        //Printing the LinkedHashMap using a for-each loop with a lambda expression (key-value pairs)
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println(" ");



        //Printing the LinkedHashMap using an Iterator with a lambda expression (key-value pairs)
        iterator = map.entrySet().iterator();
        iterator.forEachRemaining(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
        System.out.println(" ");


        //Printing the LinkedHashMap keys using a for-each loop
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(" ");



        //Printing the LinkedHashMap keys using an Iterator
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey());
        }
        System.out.println(" ");



        //Printing the LinkedHashMap keys using a for-each loop with a lambda expression
        map.keySet().forEach(System.out::println);
        System.out.println(" ");



        //Printing the LinkedHashMap keys using an Iterator with a lambda expression
        iterator = map.entrySet().iterator();
        iterator.forEachRemaining(entry -> System.out.println(entry.getKey()));
        System.out.println(" ");




        //Printing the LinkedHashMap values using a for-each loop
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println(" ");



        //Printing the LinkedHashMap values using an Iterator
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getValue());
        }
        System.out.println(" ");



        //Printing the LinkedHashMap values using a for-each loop with a lambda expression
        map.values().forEach(System.out::println);
        System.out.println(" ");
        System.out.println(" ");



        //Printing the LinkedHashMap values using an Iterator with a lambda expression
        iterator = map.entrySet().iterator();
        iterator.forEachRemaining(entry -> System.out.println(entry.getValue()));
    }
}
