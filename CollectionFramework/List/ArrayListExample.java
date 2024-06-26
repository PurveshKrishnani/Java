package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList:");
        System.out.println("Initial List: " + arrayList);

        arrayList.add("Date");

        arrayList.remove("Banana");

        System.out.println("Element at index 1: " + arrayList.get(1));

        System.out.println("Size of the list: " + arrayList.size());

        System.out.println("Is the list empty? " + arrayList.isEmpty());

        arrayList.remove(0);

        arrayList.set(1, "Elderberry");

        System.out.println("Contains 'Cherry'? " + arrayList.contains("Cherry"));



// Printing the array using for-each loop
        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println(" ");


        // Printing the array using iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        // Printing the array using iterator with lambda expression
        iterator = arrayList.iterator();
        iterator.forEachRemaining(element -> System.out.println(element));

        System.out.println(" ");


        // Printing the array using for-each loop with lambda expression
        arrayList.forEach(element -> System.out.println(element));


        System.out.println(" ");




        arrayList.clear();
        System.out.println("After clearing the list: " + arrayList);
    }
}
