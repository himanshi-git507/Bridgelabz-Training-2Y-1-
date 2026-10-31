package Arrays.Leetcode;
import java.util.*;
public class Leetcode_414 {
    public static int thirdMax(int[] nums) {
        int count = 1;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(thirdMax(arr));
    }
}
