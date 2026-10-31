package Arrays.Leetcode;

import java.util.Scanner;

class LeetCode_2733 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers are in the Array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers one by one:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        LeetCode_2733 solution = new LeetCode_2733();
        int result = solution.findNonMinOrMax(nums);

        System.out.println("Result: " + result);

        scanner.close();
    }
}