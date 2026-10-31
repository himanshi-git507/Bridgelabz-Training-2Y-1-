package Arrays.Logicalproblem;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void removeDuplicate(int arr[]) {

        System.out.println("NON-DUPLICATE ELEMENTS : ");

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE SIZE OF AN ARRAY : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicate(arr);

        sc.close();
    }
}