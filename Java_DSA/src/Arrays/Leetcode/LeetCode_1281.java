package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1281 {

    static class Solution {
        public int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                product *= digit;
                sum += digit;
                n /= 10;
            }

            return product - sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.subtractProductAndSum(n);

        System.out.println("Result: " + result);

        scanner.close();
    }
}