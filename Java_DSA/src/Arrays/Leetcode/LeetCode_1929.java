package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1929 {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        LeetCode_1929 obj = new LeetCode_1929();
        int[] result = obj.getConcatenation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}