package task_1539;

public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int[] missedItems = new int[k];
        int missedItemIndex = 0;
        int missedItem = 1;
        int maximum = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            while (missedItem < arr[i]) {
                missedItems[missedItemIndex] = missedItem;
                missedItemIndex++;
                missedItem++;
                if (missedItemIndex == k) {
                    return missedItems[k - 1];
                }
            }
            missedItem++;
        }
        while (missedItemIndex < k) {
            if (missedItem > maximum) {
                missedItems[missedItemIndex] = missedItem;
                maximum = missedItem;
                missedItemIndex++;
                if (missedItemIndex == k) {
                    return missedItems[k - 1];
                }
            }
            missedItem++;
        }
        return missedItems[0];
    }

}
