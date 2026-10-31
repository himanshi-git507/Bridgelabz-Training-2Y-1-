package Arrays.Leetcode;

public class LeetCode_13 {

    static class Solution {
        public int romanToInt(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                int current = getValue(s.charAt(i));
                int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

                result += isSubtractive(current, next) ? -current : current;
            }
            return result;
        }

        private boolean isSubtractive(int current, int next) {
            return current < next;
        }

        private int getValue(char ch) {
            switch (ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] testCases = {"III", "LVIII", "MCMXCIV", "IX", "IV"};
        runTests(testCases);
    }

    private static void runTests(String[] testCases) {
        Solution solution = new Solution();
        for (String test : testCases) {
            printResult(test, solution.romanToInt(test));
        }
    }

    private static void printResult(String input, int value) {
        System.out.println(input + " -> " + value);
    }
}