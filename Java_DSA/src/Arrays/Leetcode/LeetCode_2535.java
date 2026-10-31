package Arrays.Leetcode;

public class LeetCode_2535 {
    public int differenceOfSum(int[] nums) {
        int arrSum = 0;
        for(int i=0; i<nums.length; i++){
            arrSum+=nums[i];
        }

        int elsum = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0){
                int digit = nums[i]%10;
                elsum+=digit;
                nums[i]=nums[i]/10;
            }
        }
        int sum=arrSum-elsum;
        return sum;
    }
}
