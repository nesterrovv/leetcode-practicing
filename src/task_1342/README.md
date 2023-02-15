# Intuition
Let's code a task.

# Approach

Let's write a while-loop which will check if a number greater or equal by zero. If yes - let's decrement it if it's odd or divide be two if it's even.

# Complexity
- Time complexity:
  $O(log(n))$ - number can be divided to $2$ no more than $log(n)$ times.

- Space complexity:
  $O(1)$ - no any extra-data for storing. Only two variables: counter of steps and ```num``` variable which is given. Counter will increment in the end of each loop iteration. In the end of method we should to return counter value. Keep it simple!

# Code
```
class Solution {

    public int numberOfSteps(int num) {
        int numberOfSteps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            numberOfSteps++;
        }
        return numberOfSteps;
    }

}
```