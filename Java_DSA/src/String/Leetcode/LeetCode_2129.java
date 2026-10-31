package String.Leetcode;

import java.util.Scanner;

public class LeetCode_2129 {
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (word.length() > 2) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            sb.append(word);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        String result = capitalizeTitle(title);
        System.out.println("Result: " + result);

        sc.close();
    }
}