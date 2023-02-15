# Intuition
First item of array is first item of result array first value of so called **prevoius sum**. What is it? Previous sum is sum of $a[0] + a[1] + ... + a[n-1]$ for $a[n]$. And that's enough for a solution.

# Approach

At the begining, previous sum is equal to a first item of initial array ```nums```. Let's "write" to result array on first position value of previous sum. After that, let's iterate from ```nums[1]``` to ```nums[nums.lenght]```. Value for saving to result array is sum of ```nums[i]``` and prevoius sum value. After that, is's necessary to add ```nums[i]``` to a prevoius sum. Now it will store **the sum of all prevoius items for the next item**. Repeat and repeat in the loop... Bingo!

# Complexity
- Time complexity:
  $O(n)$, where $n$ is length of ```nums```, because we need to iterate by each symbol is this array.

- Space complexity:
  $0(1)$, because we are not store any extra-data in the algorithm. But memory which are allocated for initial array is not included.

# Code
```
class Solution {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int previousSum = nums[0];
        result[0] = previousSum;
        for (int i = 1; i < nums.length; i++) {
            result[i] = previousSum + nums[i];
            previousSum += nums[i];
        }
        return result;
    }

}
```