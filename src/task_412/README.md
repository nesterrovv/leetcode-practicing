# Intuition
Seems to easy. Let's iterare ```i``` from 1 to ```n``` (including ```n```), and define, from which category current value of ```i```?
1. Divisible by 3 and 5
2. Divisible by 3 and not by 5
3. Divisible by 5 and not by 3
4. Another category

# Approach
Let's write a loop for iterating by described ```i``` values and define category via if statements. After thar, let's add necessary string to a ```result``` list. Bingo!

# Complexity
- Time complexity:
  $O(n)$, where $n$ is given. It's necessary to iterate all numbers from $1$ to $n$ including $n$.

- Space complexity:
  $O(1)$ - there are no extra-data for storing, only list of data, which should be printed at the end.

# Code
```
import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

}
```