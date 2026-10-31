package Arrays.Logicalproblem;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int arr[]){
        int a = 0;
        int b = arr.length-1;

        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void display(int arr[]){
        for(int a = 0; a < arr.length; a++){
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("ENTER THE ARRAY ELEMENTS : ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ACTUAL ARRAY : ");
        display(arr);

        reverse(arr);

        System.out.print("REVERSED ARRAY : ");
        display(arr);
    }
}
