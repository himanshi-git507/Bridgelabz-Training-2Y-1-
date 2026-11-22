package Stack.Assignment_05;

import java.util.HashMap;

public class PairWithGivenSum {

    static boolean findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + " and " + num);
                return true;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;

        System.out.println(findPair(arr, target));
    }
}
