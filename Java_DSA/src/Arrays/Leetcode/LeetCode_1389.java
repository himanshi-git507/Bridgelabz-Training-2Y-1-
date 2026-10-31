package Arrays.Leetcode;

import java.util.*;

public class LeetCode_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] idx = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
            idx[i] = sc.nextInt();
        }

        LeetCode_1389 obj = new LeetCode_1389();
        int[] result = obj.createTargetArray(nums, idx);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}