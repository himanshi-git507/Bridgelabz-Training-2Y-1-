package Arrays.Logicalproblem;

import java.util.Scanner;

public class FirstRepeating {
    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int firstRepeating(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF AN ARRAY : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        display(arr);
        int firstRepeat = firstRepeating(arr);

        if(firstRepeat == -1){
            System.out.println("NO REPEATING ELEMENT FOUND");
        } else {
            System.out.println("FIRST REPEATING ELEMENT : " + firstRepeat);
        }

    }
}
