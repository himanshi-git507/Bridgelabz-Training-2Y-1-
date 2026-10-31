package Arrays.Leetcode;

public class LeetCode_2595 {

    static class Solution {
        public int[] evenOddBit(int n) {
            int even = countBitsAtPositions(n, true);
            int odd = countBitsAtPositions(n, false);
            return new int[] {even, odd};
        }

        private int countBitsAtPositions(int n, boolean countEven) {
            int count = 0;
            boolean isEvenPosition = true;

            while (n > 0) {
                if (isEvenPosition == countEven) {
                    count += getLastBit(n);
                }
                isEvenPosition = !isEvenPosition;
                n = shiftRight(n);
            }
            return count;
        }

        private int getLastBit(int n) {
            return n & 1;
        }

        private int shiftRight(int n) {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int[] testCases = {17, 2, 15, 0, 100};
        runTests(testCases);
    }

    private static void runTests(int[] testCases) {
        Solution solution = new Solution();
        for (int test : testCases) {
            printResult(test, solution.evenOddBit(test));
        }
    }

    private static void printResult(int input, int[] result) {
        System.out.println(input + " -> Even: " + result[0] + ", Odd: " + result[1]);
    }
}
