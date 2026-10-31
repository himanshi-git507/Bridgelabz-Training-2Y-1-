package String.Leetcode;

import java.util.Scanner;
import java.util.Arrays;

public class LeetCode_645 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) {
                duplicate = Math.abs(nums[i]);
            } else {
                nums[idx] = -nums[idx];
            }
        }
        int missing = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findErrorNums(nums);
        System.out.println("Result: " + Arrays.toString(result));

        sc.close();
    }
}
