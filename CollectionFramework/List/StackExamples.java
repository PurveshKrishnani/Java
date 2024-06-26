package CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Is the stack empty? " + stack.isEmpty());


        System.out.println(" ");

        // Printing the Stack using an Iterator
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");


        // Printing the Stack using an Iterator with a lambda expression
        iterator = stack.iterator();
        iterator.forEachRemaining(element -> System.out.println(element));

        System.out.println(" ");


        // Printing the Stack using a for-each loop with a lambda expression
        stack.forEach(element -> System.out.println(element));

        System.out.println(" ");

    }

    private static class Stack<T> implements Iterable<T> {
        private LinkedList<T> list;

        public Stack() {
            list = new LinkedList<>();
        }

        public void push(T item) {
            list.addFirst(item);
        }

        public T pop() {
            return list.removeFirst();
        }

        public T peek() {
            return list.peekFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }

        @Override
        public Iterator<T> iterator() {
            return list.iterator();
        }
    }
}
