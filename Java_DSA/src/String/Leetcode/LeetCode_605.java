package String.Leetcode;

import java.util.Scanner;

public class LeetCode_605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of plots: ");
        int size = sc.nextInt();
        int[] flowerbed = new int[size];
        System.out.println("Enter " + size + " values (0s and 1s):");
        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        System.out.print("Enter n (flowers to plant): ");
        int n = sc.nextInt();

        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println("Result: " + result);

        sc.close();
    }
}
