package String.Leetcode;

import java.util.*;

public class LeetCode_520 {
    public static boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        if (capitalCount == 0 || capitalCount == word.length()) {
            return true;
        }
        return capitalCount == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = detectCapitalUse(word);
        System.out.println("Result: " + result);

        sc.close();
    }
}
