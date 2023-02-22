package task_27;

import java.util.Arrays;

public class Solution {

    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int amountOfDeletions = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                delete(nums, i);
                amountOfDeletions++;
                nums[nums.length - 1] = 51;
            }
            if (nums[i] == val) {
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
