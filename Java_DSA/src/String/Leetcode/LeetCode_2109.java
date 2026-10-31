package String.Leetcode;

import java.util.Scanner;

public class LeetCode_2109 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < s.length()) {
            if (j < spaces.length && i == spaces[j]) {
                result.append(" ");
                j++;
            }
            result.append(s.charAt(i));
            i++;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of space positions: ");
        int n = sc.nextInt();
        int[] spaces = new int[n];
        System.out.println("Enter " + n + " space positions:");
        for (int k = 0; k < n; k++) {
            spaces[k] = sc.nextInt();
        }

        String result = addSpaces(s, spaces);
        System.out.println("Result: " + result);

        sc.close();
    }
}
