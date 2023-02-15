# Intuition
Let's try to iterate item by item in a given array and append each number (as a ```char```) to a ```StringBuilder``` object. After that we can to parse this string to a number, get the sum, and split sum value to a array of digits. Bingo?

# Approach

Yeah, it is. But.
1. ```int``` is too small for storing some number with big absolute value...
2. ```long``` is small too! Number can be a **really big**!
3. Using ```java.math.BigDecimal``` objects allows us to solve these problems.

**Not** it's bingo!

# Complexity
- Time complexity:
  $$O(n)$$, where $$n$$ is number of digits in result sum

- Space complexity:
  $$O(n)$$, where $$n$$ is amount of digits in result sum

# Code
```
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : num) {
            stringBuilder.append(i);
        }
        BigDecimal number = new BigDecimal(stringBuilder.toString());
        BigDecimal sum = number.add(new BigDecimal(k));
        String stringSum = String.valueOf(sum);
        System.out.println(stringSum);
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < stringSum.length(); i++) {
            result.add(Integer.valueOf(Character.toString(stringSum.charAt(i))));
        }
        return result;
    }

}
```