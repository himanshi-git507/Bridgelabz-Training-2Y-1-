package Arrays.Leetcode;

import java.util.*;

public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
        LeetCode_14 solution = new LeetCode_14();

        String[] test1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(test1));

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(test2));

        String[] test3 = {"interspecies", "interstellar", "interstate"};
        System.out.println(solution.longestCommonPrefix(test3));
    }
}