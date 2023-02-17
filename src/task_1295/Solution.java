package task_1295;

public class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((int) (Math.log10(nums[i])) + 1) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
