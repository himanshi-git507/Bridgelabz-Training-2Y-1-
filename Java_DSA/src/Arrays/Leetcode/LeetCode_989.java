package Arrays.Leetcode;

import java.util.*;

public class LeetCode_989 {

    static class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            LinkedList<Integer> result = new LinkedList<>();
            int i = num.length - 1;

            while (i >= 0 || k > 0) {
                int sum = k;
                if (i >= 0) sum += num[i--];

                result.addFirst(sum % 10);
                k = sum / 10;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many digits: ");
        int n = scanner.nextInt();

        int[] num = new int[n];
        System.out.println("Enter " + n + " digits one by one:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        List<Integer> result = solution.addToArrayForm(num, k);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
