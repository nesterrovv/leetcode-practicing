package task_88;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = Arrays.copyOf(nums1, nums1.length);
        int numberOfInsertions = m+n;
        int counter = 0;
        int i = 0;
        int j = 0;
        while (counter < numberOfInsertions) {
            if (i == m) {
                nums1[counter] = nums2[j];
                j++;
            } else if (j == n) {
                nums1[counter] = tmp[i];
                i++;
            } else {
                if (tmp[i] <= nums2[j]) {
                    nums1[counter] = tmp[i];
                    i++;
                } else {
                    nums1[counter] = nums2[j];
                    j++;
                }
            }
            counter++;
        }
    }

}
