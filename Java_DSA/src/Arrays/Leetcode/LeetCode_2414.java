package Arrays.Leetcode;

class LeetCode_2414 {
    public int longestContinuousSubstring(String s) {
        if (s.length() == 0) return 0;

        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(count, max);
        }

        return max;
    }

    public static void main(String[] args) {
        LeetCode_2414 solution = new LeetCode_2414();

        System.out.println(solution.longestContinuousSubstring("abacaba"));
        System.out.println(solution.longestContinuousSubstring("abcde"));
        System.out.println(solution.longestContinuousSubstring(""));
        System.out.println(solution.longestContinuousSubstring("a"));
    }
}