package task_1011;

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minimalCapacity = 0;
        int maximalCapacity = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > minimalCapacity) {
                minimalCapacity = weights[i];
            }
            maximalCapacity += weights[i];
        }
        int middle = (maximalCapacity + minimalCapacity) / 2;
        int spentDaysAmount = countDaysSpentAmount(weights, middle);
        while (minimalCapacity != maximalCapacity) {
            if (spentDaysAmount < days) {
                maximalCapacity = middle;
            } else {
                minimalCapacity = middle + 1;
            }
            middle = (maximalCapacity + minimalCapacity) / 2;
            spentDaysAmount = countDaysSpentAmount(weights, middle);
        }
        return minimalCapacity;
    }

    public int countDaysSpentAmount(int[] weights, int shipCapacity) {
        int dayCounter = 0;
        int currentCapacity = 0;
        for (int i = 0; i < weights.length; i++) {
            if (currentCapacity + weights[i] > shipCapacity) {
                dayCounter++;
                currentCapacity = weights[i];
            } else {
                currentCapacity += weights[i];
            }
        }
        return dayCounter;
    }

}
