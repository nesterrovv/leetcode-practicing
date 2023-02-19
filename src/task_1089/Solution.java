package task_1089;

import java.util.Arrays;

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        int tmpIndex = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 0) {
                if (tmpIndex <= arr.length - 1) {
                    arr[tmpIndex] = tmp[i];
                    tmpIndex++;
                }
            } else {
                if (tmpIndex <= arr.length - 2) {
                    arr[tmpIndex] = tmp[i];
                    arr[tmpIndex+1] = tmp[i];
                    tmpIndex += 2;
                } else if (tmpIndex <= arr.length - 1) {
                    arr[tmpIndex] = tmp[i];
                    tmpIndex++;
                }
            }
        }
    }

}