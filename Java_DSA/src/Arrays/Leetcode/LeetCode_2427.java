package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_2427 {

    static class Solution {
        public int commonFactors(int a, int b) {
            int count = 0;
            int limit = Math.min(a, b);

            for (int x = 1; x <= limit; x++) {
                if (a % x == 0 && b % x == 0) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.commonFactors(a, b);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
