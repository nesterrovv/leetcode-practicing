# Intuition
It seems easy. It's interesting to count sum of a row of given grid. It's a sum of money in all banks for one customer. Let's find maximum in set of "row-sums".

# Approach
Row sum is sum of money in all banks for one customer. Let's save this value to a ```moneyOfCurrentCustomer``` variable. After that, let's compare: is this value greater than ```moneyOfRichestCustomer``` value? If yes, let's re-write value of maximum. After that, it's necessary to save 0 to ```moneyOfCurrentCustomer``` variable (we are not calculating money sum for all people!) and repeat iteration.

# Complexity
- Time complexity:
  $O(n*m)$, where $n$ is number of rows, $m$ is number of columns in the grid. Necessary to iterate by all rows and all columns for finding an answer.

- Space complexity:
  $O(1)$. There are only two ```int``` type variables for storing all necessary data.

# Code
```
class Solution {

    public int maximumWealth(int[][] accounts) {
        int moneyOfRichestCustomer = 0;
        int moneyOfCurrentCustomer = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                moneyOfCurrentCustomer += accounts[i][j];
            }
            if (moneyOfCurrentCustomer > moneyOfRichestCustomer) {
                moneyOfRichestCustomer = moneyOfCurrentCustomer;
            }
            moneyOfCurrentCustomer = 0;
        }
        return moneyOfRichestCustomer;
    }
    
}
```