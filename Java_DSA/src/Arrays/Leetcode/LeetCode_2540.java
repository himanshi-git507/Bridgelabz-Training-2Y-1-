package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j])
            {
                return nums1[i];
            }

            else if(nums1[i]<nums2[j])
            {
                return nums2[j];
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i=0;i<n;i++)
        {
            nums1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++)
        {
            nums2[j]=sc.nextInt();
        }
        System.out.println(getCommon(nums1,nums2));
    }
}
