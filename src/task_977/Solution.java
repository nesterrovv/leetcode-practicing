package task_977;

import java.util.Arrays;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int i = nums.length - 1;
        int j  = 0;
        for (int a = answer.length - 1; a >= 0; a--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                answer[a] = nums[i] * nums[i];
                i--;
            } else {
                answer[a] = nums[j] * nums[j];
                j++;
            }
        }
        return answer;
    }

}
