package String.Leetcode;

import java.util.Scanner;

public class LeetCode_191 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = hammingWeight(n);
        System.out.println("Result: " + result);

        sc.close();
    }
}
