package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_633 {

    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        LeetCode_633 obj = new LeetCode_633();
        boolean result = obj.judgeSquareSum(c);

        System.out.println(result);
    }
}