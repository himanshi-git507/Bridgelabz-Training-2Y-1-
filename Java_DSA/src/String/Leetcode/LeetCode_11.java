package String.Leetcode;

import java.util.Scanner;

public class LeetCode_11
{
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = (right - left) * minHeight;
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter " + n + " height values:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);
        System.out.println("Max Area: " + result);

        sc.close();
    }
}
