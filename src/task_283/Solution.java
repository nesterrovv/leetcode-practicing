package task_283;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("ans: " + Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length;  i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else if (zeroes > 0) {
                int tmp = nums[i];
                nums[i] = 0;
                nums[i - zeroes] = tmp;
            }
        }
    }

}
