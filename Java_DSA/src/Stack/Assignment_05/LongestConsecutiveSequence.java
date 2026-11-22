package Stack.Assignment_05;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(arr));
    }
}
