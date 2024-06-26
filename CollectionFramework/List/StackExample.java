package CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StackExample {
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
    }

    private static class Stack<T> {
        private List<T> list;

        public Stack() {
            list = new LinkedList<>();
        }

        public void push(T item) {
            list.add(0, item);
        }

        public T pop() {
            return list.remove(0);
        }

        public T peek() {
            return list.get(0);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }

        @Override
        public String toString() {
            return list.toString();
        }
    }
}
