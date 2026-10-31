package Arrays.Leetcode;

import java.util.Scanner;

    public class LeetCode_263 {

        static class Solution {
            public boolean isUgly(int n) {
                if (n <= 0) return false;

                while (n % 2 == 0) n /= 2;
                while (n % 3 == 0) n /= 3;
                while (n % 5 == 0) n /= 5;

                return n == 1;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = scanner.nextInt();

            Solution solution = new Solution();
            boolean result = solution.isUgly(n);

            System.out.println("Result: " + result);

            scanner.close();
        }
    }
