package Arrays.Logicalproblem;

import java.util.Scanner;

public class SwapArray {

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter first index: ");
            int i = sc.nextInt();

            System.out.print("Enter second index: ");
            int j = sc.nextInt();

            swap(arr, i, j);

            System.out.println("After Swapping:");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }

            sc.close();
        }
    }

