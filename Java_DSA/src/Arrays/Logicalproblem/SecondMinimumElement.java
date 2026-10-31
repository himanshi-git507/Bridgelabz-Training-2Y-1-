package Arrays.Logicalproblem;

import java.util.Scanner;

public class SecondMinimumElement {

    public static int secondMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        return secondMin;
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

        int result = secondMin(arr);

        System.out.println("SECOND MINIMUM ELEMENT = " + result);
    }
}
