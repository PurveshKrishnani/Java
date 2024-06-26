package CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Elephant");
        linkedList.add("Fox");
        linkedList.add("Giraffe");

        System.out.println("\nLinkedList:");
        System.out.println("Initial List: " + linkedList);

        linkedList.addFirst("Dog");

        linkedList.addLast("Cat");

        linkedList.removeLast();

        linkedList.removeFirst();

        System.out.println("First element: " + linkedList.getFirst());

        System.out.println("Contains 'Fox'? " + linkedList.contains("Fox"));

        System.out.println("Size of the list: " + linkedList.size());

        System.out.println(" ");

        // Printing the LinkedList using an Iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");


        // Printing the LinkedList using a for-each loop
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println(" ");


        // Printing the LinkedList using an Iterator with a lambda expression
        iterator = linkedList.iterator();
        iterator.forEachRemaining(element -> System.out.println(element));

        System.out.println(" ");


        // Printing the LinkedList using a for-each loop with a lambda expression
        linkedList.forEach(element -> System.out.println(element));

        System.out.println(" ");


        // Clear the list
        linkedList.clear();
        System.out.println("\nAfter clearing the list: " + linkedList);
    }
}
