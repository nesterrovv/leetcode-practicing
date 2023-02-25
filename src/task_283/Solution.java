package task_283;

public class Solution {

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
