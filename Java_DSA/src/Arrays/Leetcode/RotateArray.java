package Arrays.Leetcode;

import java.util.Scanner;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        int n = nums.length - 1;

        reverse(nums, 0, n);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void display(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        k=k%nums.length;
        int n = nums.length-1;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }
}
