package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
                result[i] = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        LeetCode_1365 obj = new LeetCode_1365();
        int[] result = obj.smallerNumbersThanCurrent(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}