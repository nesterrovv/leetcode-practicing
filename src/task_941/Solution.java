package task_941;

public class Solution {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int top = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            } else if (arr[i] > arr[i + 1]){
                top = i;
                if (top == 0) {
                    return false;
                }
                break;
            }
        }
        if (!(top >= arr.length || top < 0)) {
            for (int i = top + 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    return false;
                } else if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
