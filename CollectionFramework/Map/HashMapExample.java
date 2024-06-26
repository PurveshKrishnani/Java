package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static java.time.chrono.JapaneseEra.values;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);



        System.out.println(" ");

        //Printing the HashMap using a for-each loop (key-value pairs)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(" ");


        //Printing the HashMap using an Iterator (key-value pairs)
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(" ");


        //Printing the HashMap using a for-each loop with a lambda expression (key-value pairs)
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println(" ");



        //Printing the HashMap using an Iterator with a lambda expression (key-value pairs)
        iterator = map.entrySet().iterator();
        iterator.forEachRemaining(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));



        System.out.println(" ");

        //Printing the HashMap keys using a for-each loop
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(" ");


        Iterator<String> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println(key);
        }

        System.out.println(" ");


        //Printing the HashMap keys using a for-each loop with a lambda expression
        map.keySet().forEach(System.out::println);

        System.out.println(" ");


        //Printing the HashMap keys using an Iterator with a lambda expression
        Iterator<String> keyi = map.keySet().iterator();
        keyi.forEachRemaining(System.out::println);

        System.out.println(" ");





        System.out.println("\nPrinting the HashMap values using a for-each loop:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        System.out.println(" ");



        //Printing the HashMap values using an Iterator
        Iterator<Integer> itval= map.values().iterator();
        while (itval.hasNext()) {
            System.out.println(itval.next());
        }

        System.out.println(" ");




        //Printing the HashMap values using a for-each loop with a lambda expression
        map.values().forEach(System.out::println);

        System.out.println(" ");



        //Printing the HashMap values using an Iterator with a lambda expression
        Iterator<Integer>itv = map.values().iterator();
        itv.forEachRemaining(System.out::println);
    }
}
