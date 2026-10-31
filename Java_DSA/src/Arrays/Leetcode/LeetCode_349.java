package Arrays.Leetcode;

import java.util.*;

public class LeetCode_349 {

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }

            Set<Integer> resultSet = new HashSet<>();
            for (int num : nums2) {
                if (set1.contains(num)) {
                    resultSet.add(num);
                }
            }

            int[] result = new int[resultSet.size()];
            int idx = 0;
            for (int num : resultSet) {
                result[idx++] = num;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) nums1[i] = scanner.nextInt();

        System.out.print("Enter size of nums2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) nums2[i] = scanner.nextInt();

        Solution solution = new Solution();
        int[] result = solution.intersection(nums1, nums2);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        scanner.close();
    }
}