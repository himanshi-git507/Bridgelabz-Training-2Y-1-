package recursion;

import java.util.Scanner;

public class SubsetSum {

    static boolean subsetSum(int[] arr, int index, int target) {
        if (target == 0) {
            return true;
        }

        if (index == arr.length || target < 0) {
            return false;
        }

        if (subsetSum(arr, index + 1, target - arr[index])) {
            return true;
        }

        if (subsetSum(arr, index + 1, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        if (subsetSum(arr, 0, target)) {
            System.out.println("Subset with target sum exists");
        } else {
            System.out.println("Subset with target sum does not exist");
        }

        sc.close();
    }
}
