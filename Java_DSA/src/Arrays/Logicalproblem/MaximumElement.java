package Arrays.Logicalproblem;

import java.util.Scanner;

public class MaximumElement {

    public static int maxElement(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF AN ARRAY : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxElement(arr);

        System.out.println("MAXIMUM ELEMENT = " + result);
    }
}
