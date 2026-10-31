package Arrays.Leetcode;

import java.util.Scanner;

class LeetCode_3232 {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter how many numbers are in the array: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter " + n + " numbers one by one:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            LeetCode_3232 solution = new LeetCode_3232();
            boolean result = solution.canAliceWin(nums);

            System.out.println("Can Alice win? " + result);

            scanner.close();
        }
    }
}


