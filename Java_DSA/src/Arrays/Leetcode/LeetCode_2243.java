package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_2243 {

    static class Solution {
        public String digitSum(String s, int k) {
            char[] current = s.toCharArray();

            while (current.length > k) {
                current = processOnce(current, k);
            }

            return new String(current);
        }

        char[] processOnce(char[] s, int k) {
            int totalLength = s.length;
            int numGroups = (totalLength + k - 1) / k;

            char[] tempResult = new char[totalLength];
            int resultLen = 0;

            int i = 0;
            for (int g = 0; g < numGroups; g++) {
                int end = Math.min(i + k, totalLength);
                int sum = sumDigits(s, i, end);

                char[] sumDigitsArr = intToChars(sum);
                for (char c : sumDigitsArr) {
                    tempResult[resultLen++] = c;
                }

                i = end;
            }

            char[] finalResult = new char[resultLen];
            System.arraycopy(tempResult, 0, finalResult, 0, resultLen);
            return finalResult;
        }

        int sumDigits(char[] s, int start, int end) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += s[i] - '0';
            }
            return sum;
        }

        char[] intToChars(int num) {
            if (num == 0) return new char[]{'0'};

            int digitCount = 0;
            int temp = num;
            while (temp > 0) {
                digitCount++;
                temp /= 10;
            }

            char[] result = new char[digitCount];
            for (int i = digitCount - 1; i >= 0; i--) {
                result[i] = (char) ('0' + (num % 10));
                num /= 10;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = scanner.next();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        String result = solution.digitSum(s, k);

        System.out.println("Result: " + result);

        scanner.close();
    }
}