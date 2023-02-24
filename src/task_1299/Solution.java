package task_1299;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[] {})));
    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
        } else {
            int max = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                int tmp = arr[i];
                arr[i] = max;
                if (tmp > max) {
                    max = tmp;
                }
            }
            arr[arr.length - 1] = -1;
        }
        return arr;
    }

}
