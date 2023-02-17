package task_485;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnesCounter = 0;
        int currentCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                currentCounter = 0;
            } else {
                currentCounter++;
            }
            if (consecutiveOnesCounter < currentCounter) {
                consecutiveOnesCounter = currentCounter;
            }
        }
        return consecutiveOnesCounter;
    }

}
