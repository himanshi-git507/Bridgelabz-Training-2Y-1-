package Arrays.Logicalproblem;

import java.util.Scanner;

public class SecondMaximumElement {

    public static int secondMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
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

        int result = secondMax(arr);

        System.out.println("SECOND MAXIMUM ELEMENT = " + result);
    }
}