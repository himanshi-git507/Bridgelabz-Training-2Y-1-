package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_2094 {

    static class Solution {
        public int[] findEvenNumbers(int[] digits) {
            boolean[] found = new boolean[1000];

            for (int i = 0; i < digits.length; i++) {
                for (int j = 0; j < digits.length; j++) {
                    for (int k = 0; k < digits.length; k++) {
                        if (i == j || j == k || i == k) continue;

                        if (!isValid(digits[i], digits[k])) continue;

                        int number = buildNumber(digits[i], digits[j], digits[k]);
                        found[number] = true;
                    }
                }
            }

            return collectResults(found);
        }

        private boolean isValid(int hundreds, int ones) {
            if (hundreds == 0) return false;
            if (ones % 2 != 0) return false;
            return true;
        }

        private int buildNumber(int hundreds, int tens, int ones) {
            return hundreds * 100 + tens * 10 + ones;
        }

        private int[] collectResults(boolean[] found) {
            int count = countTrue(found);
            int[] result = new int[count];
            int idx = 0;

            for (int num = 0; num < found.length; num++) {
                if (found[num]) {
                    result[idx] = num;
                    idx++;
                }
            }
            return result;
        }

        private int countTrue(boolean[] found) {
            int count = 0;
            for (int i = 0; i < found.length; i++) {
                if (found[i]) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many digits: ");
        int n = scanner.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter " + n + " digits one by one:");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        runTest(digits);

        scanner.close();
    }

    private static void runTest(int[] digits) {
        Solution solution = new Solution();
        int[] result = solution.findEvenNumbers(digits);
        printResult(result);
    }

    private static void printResult(int[] result) {
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
