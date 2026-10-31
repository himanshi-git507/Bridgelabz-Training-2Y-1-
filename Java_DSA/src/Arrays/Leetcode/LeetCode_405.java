package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_405 {

    static class Solution {
        public String toHex(int num) {
            if (num == 0) return "0";

            char[] hexDigits = "0123456789abcdef".toCharArray();
            char[] result = new char[8];
            int idx = 7;

            while (num != 0) {
                int digit = num & 0xF;
                result[idx] = hexDigits[digit];
                idx--;
                num = num >>> 4;
            }

            return new String(result, idx + 1, 7 - idx);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scanner.nextInt();

        Solution solution = new Solution();
        String result = solution.toHex(num);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
