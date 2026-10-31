package Arrays.Logicalproblem;

import java.util.Scanner;

public class PrimeInArray {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
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

        System.out.println("PRIME NUMBERS IN ARRAY : ");

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}