package String.Leetcode;

import java.util.Scanner;

public class LeetCode_168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            sb.append((char) ('A' + rem));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column number: ");
        int columnNumber = sc.nextInt();

        String result = convertToTitle(columnNumber);
        System.out.println("Column Title: " + result);

        sc.close();
    }
}
