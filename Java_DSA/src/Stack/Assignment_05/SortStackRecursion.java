package Stack.Assignment_05;

import java.util.Stack;

public class SortStackRecursion {

    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int value = stack.pop();
        sortStack(stack);
        insertSorted(stack, value);
    }

    static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
