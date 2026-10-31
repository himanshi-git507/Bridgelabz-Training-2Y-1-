package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1295 {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = 0;

            while (num != 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        LeetCode_1295 obj = new LeetCode_1295();
        int result = obj.findNumbers(nums);

        System.out.println(result);
    }
}