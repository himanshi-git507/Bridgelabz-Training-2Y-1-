package Arrays.Logicalproblem;

import java.util.Scanner;

public class MinimumElement {

    public static int minElement(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
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

        int result = minElement(arr);

        System.out.println("MINIMUM ELEMENT = " + result);
    }
}