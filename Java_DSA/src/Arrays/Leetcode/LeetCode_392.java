package Arrays.Leetcode;

class LeetCode_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j++))
                i++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        LeetCode_392 solution = new LeetCode_392();

        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
        System.out.println(solution.isSubsequence("axc", "ahbgdc"));
        System.out.println(solution.isSubsequence("", "ahbgdc"));
        System.out.println(solution.isSubsequence("abc", ""));
    }
}