package Arrays.Leetcode;

class LeetCode_1456 {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        LeetCode_1456 solution = new LeetCode_1456();

        System.out.println(solution.maxVowels("abciiidef", 3));
        System.out.println(solution.maxVowels("aeiou", 2));
        System.out.println(solution.maxVowels("leetcode", 3));
    }
}