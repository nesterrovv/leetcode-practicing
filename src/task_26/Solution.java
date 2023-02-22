package task_26;

import java.util.Arrays;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int amountOfDeletions = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 101) {
                delete(nums, i);
                amountOfDeletions++;
                nums[nums.length - 1] = 101;
            }
            if (nums[i] == nums[i+1] && nums[i] != 101) {
                i--;
            }
        }
        return nums.length - amountOfDeletions;
    }

    public void delete(int[] array, int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
    }

}
