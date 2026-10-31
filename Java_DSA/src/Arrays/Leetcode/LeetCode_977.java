package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_977 {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        LeetCode_977 obj = new LeetCode_977();
        int[] result = obj.sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}