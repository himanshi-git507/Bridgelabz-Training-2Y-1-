package String.Leetcode;

import java.util.*;

public class LeetCode_3158 {
    public static int duplicateNumbersXOR(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            if (!seen.add(num)) {
                result ^= num;
            }
        }
        return result;
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

        int result = duplicateNumbersXOR(nums);
        System.out.println("Result: " + result);

        sc.close();
    }
}
