package task_540;

public class Solution {

    public int singleNonDuplicate(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            int middle = (first + last) / 2;
            if((middle % 2 == 0 && nums[middle] == nums[middle + 1])
                    || (middle % 2 == 1 && nums[middle] == nums[middle - 1])) {
                first = middle + 1;
            } else {
                last = middle;
            }
        }
        return nums[first];
    }

}
