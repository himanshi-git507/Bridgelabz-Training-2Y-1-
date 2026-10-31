package Arrays.Leetcode;

import java.util.*;

public class LeetCode_628 {

    static class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;

            int optionA = nums[n - 1] * nums[n - 2] * nums[n - 3];
            int optionB = nums[0] * nums[1] * nums[n - 1];

            return Math.max(optionA, optionB);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers one by one:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maximumProduct(nums);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
