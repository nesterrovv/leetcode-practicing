package task_1675;

import java.util.TreeSet;

public class Solution {

    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                set.add(nums[i]);
            } else {
                set.add(nums[i] * 2);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        while (true) {
            max = set.last();
            min = set.first();
            minDiff = Math.min(minDiff, max - min);
            if (max % 2 == 0) {
                set.remove(max);
                set.add(max / 2);
            } else {
                break;
            }
        }
        return minDiff;
    }

}
