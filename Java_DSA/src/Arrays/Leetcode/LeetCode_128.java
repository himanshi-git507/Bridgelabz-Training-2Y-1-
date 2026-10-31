package Arrays.Leetcode;

import java.util.*;

public class LeetCode_128 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        LeetCode_128 solution = new LeetCode_128();

        System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(solution.longestConsecutive(new int[]{}));
    }
}