package String.Leetcode;

import java.util.Scanner;

public class LeetCode_3622 {
    public static boolean checkDivisibility(int n) {
        int temp = n;
        int digitSum = 0;
        int digitProduct = 1;
        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            digitProduct *= digit;
            temp /= 10;
        }
        return n % (digitSum + digitProduct) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        boolean result = checkDivisibility(n);
        System.out.println("Result: " + result);

        sc.close();
    }
}
