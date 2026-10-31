package String.Leetcode;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class LeetCode_682 {
    public static int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int second = stack.peek();
                stack.push(top);
                stack.push(top + second);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] operations = new String[n];
        System.out.println("Enter " + n + " operations (integer, '+', 'D', or 'C'):");
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int result = calPoints(operations);
        System.out.println("Result: " + result);

        sc.close();
    }
}
