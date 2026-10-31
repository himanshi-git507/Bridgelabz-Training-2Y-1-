package Arrays.Leetcode;

public class LeetCode_1832 {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] < 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode_1832 solution = new LeetCode_1832();
        System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(solution.checkIfPangram("leetcode"));
    }
}