package Stack.Assignment_05;

import java.util.*;

public class ZeroSumSubarrays {

    static void findSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    System.out.println("Subarray from index " + i + " to " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2, -2};

        findSubarrays(arr);
    }
}
